package demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuesser {
    private Scanner sc;
    private Integer secret;

    public NumberGuesser() {
        sc = new Scanner(System.in);
        secret = (int)(Math.random() * 100 + 1);
    }

    public static void main(String[] args) {
        new NumberGuesser().run();
    }

    private void run() {
        boolean guessed = false;
        int guess;

        while (!guessed) {
            try {
                System.out.print("Enter a number between 1 and 100 > ");
                guess = sc.nextInt();

                if (guess < secret)
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
