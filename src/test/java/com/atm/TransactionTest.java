package com.atm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    public void testDeposit() {
        Account account = new Account(100.0);
        Transaction.deposit(account, 50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account(100.0);
        Transaction.withdraw(account, 50.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    public void testInvalidDeposit() {
        Account account = new Account(100.0);
        Transaction.deposit(account, -50.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testInvalidWithdraw() {
        Account account = new Account(100.0);
        Transaction.withdraw(account, 150.0);
        assertEquals(100.0, account.getBalance());
    }
}
