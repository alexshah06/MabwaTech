package com.mabwatech.models.manager.impl;

import com.mabwatech.models.manager.UserManager;
import com.mabwatech.models.MtUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl extends BaseModelManagerImpl implements UserManager {
    private static final Logger log = LoggerFactory.getLogger(UserManagerImpl.class);

    @Autowired
    private UserManager userMan;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Override
    public MtUser getUser(Long id) {
        return get(id, MtUser.class);
    }

    @Override
    public MtUser getUser(String email) {
        return getByField("email", email, MtUser.class);
    }

    @Override
    public void createAndPersistUser(String email, String password, String authProvider) {
        MtUser existingUser = getUser(email);
        if (existingUser != null) {
            log.debug("Email already registered under user id {}", existingUser.getId());
            return;
        }
        MtUser newUser = new MtUser();
        newUser.setEmail(email);
        newUser.setPassword(passwordEncoder.encode(password));
        newUser.setAuthProvider(authProvider);
        log.debug("User successfully initialized with id {}, email {}, auth provider {}", newUser.getId(), email, authProvider);
        userMan.save(newUser);
    }

    @Override
    public String login(String email, String password) {
        MtUser user = userMan.getUser(email);
        if (user != null) {

        } else {
            log.debug("User with email " + email + " not found.");
        }
        return " ";
    }
}
