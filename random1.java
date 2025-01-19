import java.util.Random;
import java.util.Scanner;


public class random1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);
        
        
        
        
        
        
        System.out.println("guess a numbr between 1-10");
        
        
        do{
              
            System.out.print("enter a guess : ");
            guess= scanner.nextInt();
            attempts++;
              
            if(guess<randomNumber){
                System.out.println("too low try again");
            }
            else if(guess>randomNumber){
                System.out.println("too high try again");
            }
            else{
                System.out.println("correct " +randomNumber);
                System.out.println("no attempts " +attempts);
            }

                
        }while(guess!= randomNumber); 
        
        scanner.close();
           
        }


        

        }
    

      

       

    

