import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       // while loop  repeats codes forever while some conditions remains true
   Scanner scanner = new Scanner(System.in);


   String name = "";
   while(name.isEmpty()){
    System.out.println("enter your name:");
    name = scanner.nextLine();
   }
   System.out.println("hello " + name);


   scanner.close();


   }
    
    }
    
