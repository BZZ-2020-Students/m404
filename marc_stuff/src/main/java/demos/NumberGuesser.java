package demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuesser {
    private final Scanner sc;
    private final Integer secret;
    private int minNumber = 1;
    private int maxNumber = 100;

    public NumberGuesser() {
        sc = new Scanner(System.in);
        secret = (int)(Math.random() * maxNumber + minNumber);
    }

    public static void main(String[] args) {
        new NumberGuesser().run();
    }

    private void run() {
        boolean guessed = false;
        int guess;

        while (!guessed) {
            try {
                System.out.print("Enter a number between " + minNumber + " and " + maxNumber + " > ");
                guess = sc.nextInt();

                minNumber = (guess > minNumber && guess < secret) ? guess + 1 : minNumber;
                maxNumber = (guess < maxNumber && guess > secret) ? guess - 1 : maxNumber;

                if (guess > maxNumber || guess < minNumber)
                    System.out.println("Are you even trying!? This number isn't even in the range!");
                else if (guess < secret)
                    System.out.println("The secret number is greater than: " + guess);
                else if (guess > secret)
                    System.out.println("The secret number is less than: " + guess);
                else
                    guessed = true;
            } catch (InputMismatchException e) {
                System.err.println("This is not a valid Integer, please try again!");
            }
        }
        System.out.println("You've found the number!");
        System.out.println("The number was: " + secret);
    }
}
