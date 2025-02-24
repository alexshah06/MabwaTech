package com.mabwatech.models.manager;

public interface BaseModelManager {
    <T> T get(Long id, Class<T> clazz);

    <T> T getByField(String fieldName, Object value, Class<T> clazz);

    <T> void save(T entity);

    <T> void update(T entity);

    <T> void delete(Long id, Class<T> clazz);

}

