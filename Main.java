import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
     
     Scanner scanner = new Scanner(System.in); 
     System.out.print("enter your name :");
          
       String name = scanner.nextLine();
       System.out.println("enter your age:  ");
       int age = scanner.nextInt();

       System.out.println("whats your gpa : ");
        double gpa = scanner.nextDouble(); 

        System.out.println("are u student?(ture/false)");
        boolean isStudent = scanner.nextBoolean();
     
     
       System.out.println("mt name is : "+ name);
       System.out.println("my age is : "+ age);
       System.out.println("my gpa is : "+ gpa);

       if(isStudent){
        System.out.println("YOU ARE ENROLLED");
       }
       else{
        System.out.println("you are not enrolled");
       }
       
       scanner.close();  
     }
          
} 
