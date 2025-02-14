import java.util.Scanner;

public class JiyaSpecial {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        // Print welcome message
        System.out.println("=== Welcome to JIYA's Special Program! ===\n");
        
        // ASCII art for JIYA
        String[] jiya = {
            "   JJJJJ  IIIII  Y   Y    AAA   ",
            "     J      I     Y Y    A   A  ",
            "     J      I      Y    AAAAA  ",
            "  J  J      I      Y    A   A  ",
            "   JJ    IIIII     Y    A   A  "
        };
        
        // Color codes for rainbow effect
        String[] colors = {
            "\u001B[31m", // Red
            "\u001B[33m", // Yellow
            "\u001B[32m", // Green
            "\u001B[36m", // Cyan
            "\u001B[35m"  // Purple
        };
        
        // Reset color code
        String reset = "\u001B[0m";
        
        // Animated display
        for (int i = 0; i < 3; i++) {
            // Clear console (attempt to)
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            // Print JIYA with rainbow colors
            for (int line = 0; line < jiya.length; line++) {
                System.out.println(colors[line] + jiya[line] + reset);
                Thread.sleep(200);
            }
            
            System.out.println("\n" + colors[2] + "✨ Welcome JIYA! ✨" + reset);
            Thread.sleep(500);
        }
        
        // Interactive part
        System.out.println("\nLet's create a personalized message for you!");
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        
        System.out.print("Enter your lucky number: ");
        int luckyNumber = scanner.nextInt();
        
        // Create border with lucky number
        String border = "";
        for (int i = 0; i < luckyNumber; i++) {
            border += "* ";
        }
        
        // Display personalized message
        System.out.println("\n" + border);
        System.out.println("Dear JIYA,");
        System.out.println("Your favorite color is: " + favoriteColor);
        System.out.println("Your lucky number is: " + luckyNumber);
        System.out.println("You are as bright as a " + favoriteColor + " star!");
        System.out.println(border);
        
        // Create a simple pattern with lucky number
        System.out.println("\nHere's a special pattern for you:");
        for (int i = 1; i <= luckyNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("✨ ");
            }
            System.out.println();
        }
        
        // Closing message
        System.out.println("\nThank you for using JIYA's Special Program!");
        System.out.println("Have a wonderful day! ✨");
        
        scanner.close();
    }
}