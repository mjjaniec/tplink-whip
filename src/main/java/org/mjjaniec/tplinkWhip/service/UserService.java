package org.mjjaniec.tplinkWhip.service;

import org.mjjaniec.tplinkWhip.model.User;

/**
 * Created by mjjaniec on 19.12.14.
 */
public class UserService {
    public User getDefaultUser() {
        return new User("Pyczak", "127.0.0.1");
    }
}
