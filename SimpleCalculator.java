import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");

        try {
            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
