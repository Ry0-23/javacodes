import java.util.Scanner;

public class linears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        // Create array
        int[] array = new int[size];
        
        // Input array elements
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Get search element
        System.out.print("Enter the element to search: ");
        int search = scanner.nextInt();
        
        // Perform linear search
        int position = -1;
        for(int i = 0; i < size; i++) {
            if(array[i] == search) {
                position = i;
                break;
            }
        }
        
        // Display result
        if(position != -1) {
            System.out.println("Element " + search + " found at position: " + (position + 1));
        } else {
            System.out.println("Element not found in the array");
        }
        
        scanner.close();
    }
}
