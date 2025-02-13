import java.util.Scanner;
import java.util.Random;

public class rockpaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        
        while (true) {
            // Get player's choice
            System.out.println("\nLet's play Rock Paper Scissors!");
            System.out.println("Enter your choice (rock/paper/scissors) or 'quit' to exit:");
            String playerChoice = scanner.nextLine().toLowerCase();
            
            // Check if player wants to quit
            if (playerChoice.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            // Validate player input
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please choose rock, paper, or scissors.");
                continue;
            }
            
            // Generate computer's choice
            String computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer chose: " + computerChoice);
            
            // Determine winner
            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
        
        switch (playerChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "You win! Rock crushes scissors." 
                                                         : "Computer wins! Paper covers rock.";
            case "paper":
                return (computerChoice.equals("rock")) ? "You win! Paper covers rock." 
                                                     : "Computer wins! Scissors cuts paper.";
            case "scissors":
                return (computerChoice.equals("paper")) ? "You win! Scissors cuts paper." 
                                                      : "Computer wins! Rock crushes scissors.";
            default:
                return "Invalid game state!";
        }
    }
} 
        

        





        

    
    

