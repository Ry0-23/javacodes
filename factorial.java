import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Variable to store the result
        long factorial = 1;

        // Using a for loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by current number
        }

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

