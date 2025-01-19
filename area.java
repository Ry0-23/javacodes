import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        // calculate the area

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter width : ");
        double width = scanner.nextDouble();  
        System.out.print("enter height : ");
        double height = scanner.nextDouble();
        System.out.print("enter length : ");
        double length = scanner.nextDouble();
     
        double area = (width*height*length);
        System.out.println("area is : = "+area + "cm²");


      scanner.close();

    
    }

    
}
