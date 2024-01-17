import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Game!");

        boolean playAgain = true;
        while (playAgain) {

            int secretN = random.nextInt(100) + 1;
            int attempts = 0;

            int max = 10;

            while (attempts < max) {

                System.out.print("Enter your guess (1-100): ");
                int Guess = scanner.nextInt();

                if (Guess == secretN) {
                    System.out.println("Congratulations! You guessed the correct number " + secretN + " in " + (attempts + 1) + " attempts.");
                    break;
                } else if (Guess < secretN) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == max) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretN + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
    }
}
