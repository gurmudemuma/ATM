package com.atm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testGetBalance() {
        Account account = new Account(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testSetBalance() {
        Account account = new Account(100.0);
        account.setBalance(200.0);
        assertEquals(200.0, account.getBalance());
    }
}
