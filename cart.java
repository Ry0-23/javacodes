import java.util.*;

public class cart {
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);

       String item;
       double price;
       double quantity;
       double total;



       System.out.print("what item would u like to buy? :");
       item = scanner.nextLine();
      
       System.out.print("what is the price for each? :");
       price = scanner.nextDouble();
       
       System.out.print("how many would you like to buy? :");
       quantity = scanner.nextInt();
         
      total = (price*quantity); 
      System.out.print("total price would be :");
      System.out.print(total);

      scanner.close();

        
    }
    
}
