import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessingGame {
    public GuessingGame() {
        System.out.println("Howdy, what's your name");
        System.out.println("(type in your name) ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        Scanner inputGuess = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int guesses = 0;

        System.out.println(name + " Guess the number between 1 and 100: ");

        while (true) {
            int guess;
            try {
                guess = inputGuess.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }

            guesses = guesses + 1;

            if (guess < number) {
                System.out.println("Guess is too low, try again!");
            } else if (guess > number) {
                System.out.println("Guess is too high, try again!");
            } else {
                System.out.println("Good job " + name + " you guessed the number correctly in " + guesses + " guesses!");
                break;
            }
        }
    }
}