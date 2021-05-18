package GuessNumber;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Ibid umm
 * @date 2021-05-18
 * @version 1.0
 */
public class GuessNumber{

    // declare attributes
    static Scanner scanner;
    static Integer secret;

    /**
     * constructor: initialize attributes
     */
    public GuessNumber() {
        scanner = new Scanner(System.in);
        secret = (int)(Math.random() * 100 + 1);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        GuessNumber program = new GuessNumber();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        int tries = 0;
        int userInput = 0;
        int minNumber = 1;
        int maxNumber = 100;
        Integer secret = (int)(Math.random() * maxNumber + minNumber);
        System.out.println("Hallo versuche die geheime Zahl zu erraten!");
        boolean foundNumber = false;

        while(!foundNumber) {
            System.out.print("Dein Versuch (" + minNumber + " - " + maxNumber +") > ");
            userInput = scanner.nextInt();
            tries++;

            int result = compareTo(userInput, secret);
            switch (result) {
                case 0 -> {
                    System.out.println("Gratuliere!");
                    foundNumber = true;
                }
                case 1 -> {
                    maxNumber = userInput - 1;
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                }
                case -1 -> {
                    minNumber = userInput + 1;
                    System.out.println("Die gesuchte Zahl ist grösser!");
                }
            }
        }
        System.out.println("Nach " + tries + " Versuchen haben Sie die Zahl gefunden!");
    }

    private int compareTo(int value, int secret) {
        int result = 0;
        if(value > secret) {
            result = 1;
        } else if(value < secret) {
            result = -1;
        }

        return result;
    }
}
