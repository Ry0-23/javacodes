import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int rows;
        int colums;

      
      

        System.out.print("enter the no oof rows for the matrix:" );
        rows= scanner.nextInt();
        System.out.print("enter the no oof colums for the matrix: " );
        colums= scanner.nextInt();
       for(int i=0; i<=rows; i++){
        System.out.println();
        for(int j=0; j<=colums; j++){
            System.out.print("#");
        }
       }
    }
    

    
}
