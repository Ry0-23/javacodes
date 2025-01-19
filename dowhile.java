import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        System.out.println("enter age : ");
        age = scanner.nextInt();



        do{
            System.out.println("age cant be negative");
            System.out.println("enter age : ");
            age = scanner.nextInt();
        }while(age<0);

    System.out.println("my age is:" + age);

   
    }
    
}
