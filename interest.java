import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
     // simp[le interestt 
     Scanner scanner= new Scanner(System.in);
     int principle;
     int rate;
     int time;
     double si;
     System.out.print("enter priciple :");
     principle=scanner.nextInt();

     System.out.print("enter rate :");
    rate=scanner.nextInt();
     
     System.out.print("enter time(in years) :");
     time=scanner.nextInt();


     si = ((principle*rate*time)/100);

     System.out.println("simple interest is :");
     System.out.println(si);
     
    scanner.close();

    }
}
