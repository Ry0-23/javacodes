public class Varargs {  // Changed class name to start with capital letter
    public static void main(String[] args) {
        add(1, 2, 3, 4, 5, 6);
    }
    
    static int add(int... numbers) {  // Changed parameter name for clarity
        int sum = 0;
        
        // Loop through each number and add to sum
        for(int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum is: " + sum);
        return sum;
    }
}
