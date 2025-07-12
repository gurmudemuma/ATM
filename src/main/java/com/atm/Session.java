package com.atm;

public class Session {
    private User currentUser;

    public boolean login(Bank bank) {
        String userId = Console.getString("Enter user ID: ");
        String pin = Console.getString("Enter PIN: ");
        User user = bank.getUser(userId);
        if (user != null && user.validatePin(pin)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser != null;
    }
}
