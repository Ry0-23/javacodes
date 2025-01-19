
import java.util.Scanner;

public class mthod2 {
    public static void main(String[] args) {
        
        String name ;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the name : " );
        name = scanner.nextLine();
        System.out.print("enter the age : " );
        age = scanner.nextInt();
         


     //method = a block code that is executed when called.
        happyBirthday(name, age);  

    }
     static void happyBirthday(String name,int age){
        System.out.print("happy birthday "+ name);
        System.out.print("\n" + age);

     }
     
    
}
