import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Fixed Scanner initialization

        double num1;
        double num2;
        char operator;
        double result = 0; // Initialize result to avoid uninitialized usage

        System.out.print("Enter num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (* - + / %): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter num2: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '*' -> result = num1 * num2;
            case '-' -> result = num1 - num2;
            case '+' -> result = num1 + num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
            }
            case '%' -> {
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    scanner.close();
                    return;
                }
            }
            default -> {
                System.out.println("Error: Invalid operator.");
                scanner.close();
                return;
            }
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
}

