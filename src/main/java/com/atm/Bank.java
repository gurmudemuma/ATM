package com.atm;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}
