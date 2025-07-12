package com.atm;

public class Transaction {
    public static void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println(Console.GREEN + "You deposited $" + amount + Console.RESET);
        } else {
            System.out.println(Console.RED + "Invalid amount" + Console.RESET);
        }
    }

    public static void withdraw(Account account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println(Console.GREEN + "You withdrew $" + amount + Console.RESET);
        } else {
            System.out.println(Console.RED + "Invalid amount" + Console.RESET);
        }
    }
}
