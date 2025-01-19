import java.util.Scanner;
public class sq {
    public static void main(String[] args) {
       int square; 
       int number;
       
       Scanner scanner = new Scanner(System.in);
       number = scanner.nextInt();
        
       square = number*number;
       System.out.print("THE SQUARE OF A NUMBER IS  :  " + number);
    
     
     scanner.close();  

    }
 
 
    
}
