package com.atm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {
    @Test
    public void testGetUserId() {
        Account account = new Account(100.0);
        User user = new User("123", "456", account);
        assertEquals("123", user.getUserId());
    }

    @Test
    public void testValidatePin() {
        Account account = new Account(100.0);
        User user = new User("123", "456", account);
        assertTrue(user.validatePin("456"));
        assertFalse(user.validatePin("789"));
    }

    @Test
    public void testGetAccount() {
        Account account = new Account(100.0);
        User user = new User("123", "456", account);
        assertEquals(account, user.getAccount());
    }
}
