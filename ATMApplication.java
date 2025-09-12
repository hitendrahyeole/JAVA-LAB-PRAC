import java.util.Scanner;

public class ATMApplication {

    // Static variables representing account details
    static double balance = 1000.0;
    static String correctPin = "1234";
    static String correctAccountNumber = "1000000000";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        // Ask for account number and PIN
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        if (!accountNumber.equals(correctAccountNumber) || !pin.equals(correctPin)) {
            System.out.println("Invalid account number or PIN. Exiting...");
            scanner.close();
            return;
        }

        System.out.println("Login successful!");

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    System.out.println("Your current balance is $" + balance);

                } else if (choice == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    if (amount <= 0) {
                        throw new IllegalArgumentException("Deposit amount must be positive.");
                    }
                    balance += amount;
                    System.out.println("Amount deposited successfully. New balance: $" + balance);

                } else if (choice == 3) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    if (amount <= 0) {
                        throw new IllegalArgumentException("Withdrawal amount must be positive.");
                    }
                    if (amount > balance) {
                        throw new ArithmeticException("Insufficient funds.");
                    }
                    balance -= amount;
                    System.out.println("Amount withdrawn successfully. New balance: $" + balance);

                } else if (choice == 4) {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                } else {
                    System.out.println("Invalid choice. Please select between 1 and 4.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction processed.\n");
            }
        }

        scanner.close();
    }
}
