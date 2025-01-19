import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        // && //OR || //!
    int numbr;
    System.out.println("enter number : ");
    numbr = scanner.nextInt();

    if (numbr<=30 && numbr>0 ){
        System.out.println("enter weather is good");
    }else{
        System.out.println("its not good");
    }

         scanner.close();
    }
    
}
