import java.util.Scanner;

class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class Interface {
    private Bank userAccount;

    public Interface(Bank userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("Interface/Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Current Balance: Rs." + userAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter deposit amount: Rs.");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful. New Balance: Rs." + userAccount.getBalance());
                break;
            case 3:
                System.out.print("Enter withdrawal amount: Rs.");
                double withdrawAmount = scanner.nextDouble();
                boolean success = userAccount.withdraw(withdrawAmount);
                if (success) {
                    System.out.println("Withdrawal successful. New Balance: Rs." + userAccount.getBalance());
                } else {
                    System.out.println("Insufficient funds. Withdrawal failed.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the Interface. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}

public class Atm_Interface {
    public static void main(String[] args) {

        Bank userAccount = new Bank(0.0);

        Interface Interface = new Interface(userAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Interface.displayMenu();

            System.out.print("Choose an option (1-4): ");
            int option = scanner.nextInt();

            Interface.processOption(option);
        }
    }
}
