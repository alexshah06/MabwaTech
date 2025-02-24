package com.mabwatech.models.manager;

import com.mabwatech.models.MtUser;

public interface UserManager extends BaseModelManager {

    MtUser getUser(Long id);

    MtUser getUser(String email);

    void createAndPersistUser(String email, String password, String authProvider);

    String login(String email, String password);
}
