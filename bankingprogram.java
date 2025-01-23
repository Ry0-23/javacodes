import java.util.Scanner;

public class bankingprogram {
    // Move scanner to be a class-level static variable
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // Menu display
            System.out.println("----------");
            System.out.println("Banking Program");
            System.out.println("------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();
                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
        // Close the scanner at the end of the program
        scanner.close();
    }

    // Show balance method
    static void showBalance(double balance) {
        System.out.println("----------------------");
        System.out.printf("Current Balance: $%.2f\n", balance);
    }

    // Deposit method
    static double deposit() {
        System.out.println("----------------------");
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            System.out.printf("Deposited: $%.2f\n", amount);
            return amount;
        } else {
            System.out.println("Invalid deposit amount.");
            return 0;
        }
    }

    // Withdraw method
    static double withdraw(double currentBalance) {
        System.out.println("----------------------");
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        
        if (amount > 0 && amount <= currentBalance) {
            System.out.printf("Withdrawn: $%.2f\n", amount);
            return amount;
        } else if (amount > currentBalance) {
            System.out.println("Insufficient funds.");
            return 0;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return 0;
        }
    }
}
    

