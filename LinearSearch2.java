import java.util.Scanner;

public class LinearSearch2{     // Changed class name to start with capital letter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline
        
        // Create string array and get names from user
        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for(int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }
        
        // Get target name to search
        System.out.print("Enter the name to search: ");
        String target = scanner.nextLine();
        
        // Linear search
        boolean isFound = false;
        for(int i = 0; i < names.length; i++) {
            if(names[i].equals(target)) {
                System.out.println("Name found at index: " + i);
                isFound = true;
                break;
            }
        }
        
        if(!isFound) {
            System.out.println("Name not found in the array");
        }
        
        scanner.close();
    }
}




