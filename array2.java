import java.util.Arrays;
import java.util.Scanner;
public class array2 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] foods = new String[5];
      
       
      for(int i=0; i<foods.length; i++){
         System.out.print("enter food : ");
         foods[i] = scanner.nextLine();

    }
    for(String food : foods){
        System.out.println(food);
        Arrays.sort(foods);
    }
}
}
