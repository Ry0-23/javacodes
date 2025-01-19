import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        String day;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE DAY: ");
        day = scanner.nextLine().toLowerCase(); // Convert input to lowercase for uniform comparison

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> 
                System.out.println("It's a weekday");
            case "saturday", "sunday" -> 
                System.out.println("It's a weekend");
            default -> 
                System.out.println("Invalid day entered");
        }

        scanner.close();
    }
}
