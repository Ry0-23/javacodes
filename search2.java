import java.util.Scanner;

public class search2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        // Create array and get elements from user
        int[] num = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        
        // Get target element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        // Linear search
        boolean isFound = false;
        for(int i = 0; i < num.length; i++) {
            if(target == num[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        
        if(!isFound) {
            System.out.println("Element not found in the array");
        }
        
        scanner.close();
    }
}
