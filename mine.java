import java.util.Scanner;
import java.util.Random;

public class mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;  // Random number between 1 and 100
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!! Try again please.");
            } else {
                System.out.println("Too high!! Try again please.");
            }
        }

        scanner.close();
    }
}
