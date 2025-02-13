import java.util.Scanner;
import java.util.Arrays;
public class arraypract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int size;


       System.out.print("what # of array u want : ");
       size = scanner.nextInt();

       numbers = new int[size];



        for(int i=0; i<numbers.length;i++){
            System.out.print("enter a number : ");
            numbers[i]=scanner.nextInt();
        }
        for(int number : numbers){
          
            System.out.println(number);
           
        }
        //for(int i=0; i<numbers.length; i++){
        //System.out.print(numbers[+ i]);
        }

    
    }
    

