import java.util.Random;
import java.util.Scanner;

/**
 * Write a guessing game where the user tries to
 * guess the number randomly picked by the computer.
 * For each guess tell the user if the
 * guess is too high, low or correct.
 *
 * @author http://learn-java-by-example.com
 */

public class HighorLow {

    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        // Use Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);
        // Use the random generator to
        // pick a number between 0 and 99 (inclusive)
        double number = random.nextInt(100);
        double guess = -1;

        
        // Loop until the user has guessed the number
        while (guess != number) {
            // Prompt the user for their next guess
            System.out.print("Enter your guess: ");
            // Read the users guess
            guess = scanner.nextInt();
            // Check if the guess is high, low or correct
            if (guess < number) {
                // Guess is too low
                System.out.println("Too low, please try again");
            } else if (guess > number) {
                // Guess is too high
                System.out.println("Too high, please try again");
            } else {
                // Guess is correct !!
                System.out.println("Correct, the number was " + number);
            }
        }
    }

    double thisFunction(double x) {
        return x + 3;
    }
}
