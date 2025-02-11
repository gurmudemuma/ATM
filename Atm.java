package ATM;

import java.util.Scanner;

public class Atm {
    private double balance; // current account balance

    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";

    public Atm(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println(YELLOW + "Your balance is $" + balance + RESET);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(GREEN + "You deposited $" + amount + RESET);
        } else {
            System.out.println(RED + "Invalid amount" + RESET);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(GREEN + "You withdrew $" + amount + RESET);
        } else {
            System.out.println(RED + "Invalid amount" + RESET);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Atm atm = new Atm(1000); // create an ATM with $1000 initial balance

        while (true) {
            System.out.println(BLUE + "\nATM Menu: " + RESET);
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = s.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println(BLUE + "Goodbye!" + RESET);
                    System.exit(0);
                default:
                    System.out.println(RED + "Invalid choice" + RESET);
            }
        }
    }
}