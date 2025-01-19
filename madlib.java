import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {
     
        //madplot library
          
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.println("enter an adjective");
        adjective1= scanner.nextLine();
        System.out.println("enter a noun (animal or person)");
        noun1= scanner.nextLine();
        System.out.println("enter an adjective2");
        adjective2= scanner.nextLine();
        System.out.println("enter a verb and with ing"); 
        verb1= scanner.nextLine();
        System.out.println("enter an adjective3"); 
        adjective3 = scanner.nextLine();


        System.out.println("today i was at" + adjective1 + "zoo");
        System.out.println("i saw" + noun1 + "zoo");
        System.out.println("various people at" + adjective2 + verb1 + "!");
        System.out.println("i was " + adjective3 + "!");

        scanner.close();

    }
    
}
