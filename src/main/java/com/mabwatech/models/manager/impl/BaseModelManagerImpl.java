package com.mabwatech.models.manager.impl;

import com.mabwatech.models.manager.BaseModelManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseModelManagerImpl implements BaseModelManager {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> T get(Long id, Class<T> clazz) {
        return entityManager.find(clazz, id);
    }

    @Override
    public <T> T getByField(String fieldName, Object value, Class<T> clazz) {
        String query = "SELECT z FROM " + clazz.getSimpleName() + " z WHERE z." + fieldName + " = :value";
        List<T> results = entityManager.createQuery(query, clazz)
                .setParameter("value", value)
                .getResultList();
        return results.isEmpty() ? null : results.get(0);
    }

    @Override
    @Transactional
    public <T> void save(T entity) {
        if (entityManager.contains(entity)) {
            entityManager.merge(entity);
        } else {
            entityManager.persist(entity);
        }
    }

    @Override
    @Transactional
    public <T> void update(T entity) {
        entityManager.merge(entity);
    }

    @Override
    @Transactional
    public <T> void delete(Long id, Class<T> clazz) {
        T entity = entityManager.find(clazz, id);
        if (entity != null) {
            entityManager.remove(entity);
        }
    }
}
