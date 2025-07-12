package com.atm;

public class Atm {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addUser(new User("123", "456", new Account(1000)));
        bank.addUser(new User("789", "012", new Account(500)));

        Session session = new Session();

        while (true) {
            if (!session.isLoggedIn()) {
                if (!session.login(bank)) {
                    System.out.println(Console.RED + "Invalid user ID or PIN" + Console.RESET);
                    continue;
                }
            }

            System.out.println(Console.BLUE + "\nATM Menu: " + Console.RESET);
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            int choice = Console.getInt("Enter choice: ");

            switch (choice) {
                case 1:
                    System.out.println(Console.YELLOW + "Your balance is $" + session.getCurrentUser().getAccount().getBalance() + Console.RESET);
                    break;
                case 2:
                    double depositAmount = Console.getDouble("Enter amount to deposit: ");
                    Transaction.deposit(session.getCurrentUser().getAccount(), depositAmount);
                    break;
                case 3:
                    double withdrawAmount = Console.getDouble("Enter amount to withdraw: ");
                    Transaction.withdraw(session.getCurrentUser().getAccount(), withdrawAmount);
                    break;
                case 4:
                    session.logout();
                    break;
                case 5:
                    System.out.println(Console.BLUE + "Goodbye!" + Console.RESET);
                    System.exit(0);
                default:
                    System.out.println(Console.RED + "Invalid choice" + Console.RESET);
            }
        }
    }
}