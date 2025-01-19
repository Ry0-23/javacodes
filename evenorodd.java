import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter the number : ");
        number= scanner.nextInt();

        if(number%2==0){
            System.out.print("number is EVEN");
        }else
        System.out.printd("number is ODD");

    

    scanner.close();


    }
    
}
