import java.util.Scanner;

public class quizgame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 5;

        // Array of questions
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who painted the Mona Lisa?",
            "What is the largest mammal in the world?",
            "Which programming language was created by James Gosling?"
        };

        // Array of options for each question
        String[][] options = {
            {"A) London", "B) Berlin", "C) Paris", "D) Madrid"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Van Gogh", "B) Leonardo da Vinci", "C) Picasso", "D) Michelangelo"},
            {"A) African Elephant", "B) Blue Whale", "C) Giraffe", "D) White Rhinoceros"},
            {"A) Python", "B) Java", "C) C++", "D) JavaScript"}
        };

        // Array of correct answers
        char[] answers = {'C', 'B', 'B', 'B', 'B'};

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("For each question, enter A, B, C, or D as your answer.\n");

        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            
            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user input
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i]);
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your final score: " + score + " out of " + totalQuestions);
        
        // Calculate percentage
        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
