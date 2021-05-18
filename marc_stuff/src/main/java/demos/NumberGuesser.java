package demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuesser {
    private Scanner sc;
    private Integer secret;
    private static final int MINNUMBER = 69;
    private static final int MAXNUMBER = 420;
    private int minGuess = MINNUMBER;
    private int maxGuess = MAXNUMBER;

    public NumberGuesser() {
        sc = new Scanner(System.in);
        secret = (int)(Math.random() * MAXNUMBER + MINNUMBER);
    }

    public static void main(String[] args) {
        new NumberGuesser().run();
    }

    private void run() {
        boolean guessed = false;
        int guess;

        while (!guessed) {
            try {
                System.out.print("Enter a number between " + minGuess + " and " + maxGuess + " > ");
                guess = sc.nextInt();

                minGuess = (guess > minGuess && guess < secret) ? guess + 1 : minGuess;
                maxGuess = (guess < maxGuess && guess > secret) ? guess - 1 : maxGuess;

                if (guess > MAXNUMBER || guess < MINNUMBER)
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
