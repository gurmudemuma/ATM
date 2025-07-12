package com.atm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BankTest {
    @Test
    public void testAddUser() {
        Bank bank = new Bank();
        Account account = new Account(100.0);
        User user = new User("123", "456", account);
        bank.addUser(user);
        assertEquals(user, bank.getUser("123"));
    }

    @Test
    public void testGetUser() {
        Bank bank = new Bank();
        Account account = new Account(100.0);
        User user = new User("123", "456", account);
        bank.addUser(user);
        assertEquals(user, bank.getUser("123"));
        assertNull(bank.getUser("456"));
    }
}
