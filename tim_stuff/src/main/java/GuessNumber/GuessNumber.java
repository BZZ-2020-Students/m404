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
        Integer secret = (int)(Math.random() * 100 + 1);
        int tries = 0;
        int userInput = 0;
        System.out.println("Hallo versuche die geheime Zahl zu erraten!");
        boolean foundNumber = false;

        while(!foundNumber) {
            System.out.print("Dein Versuch (1 - 100) > ");
            userInput = scanner.nextInt();
            tries++;

            int result = compareTo(userInput, secret);
            switch (result) {
                case 0:
                    System.out.println("Gratuliere!");
                    foundNumber = true;
                    break;
                case 1:
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    break;
                case -1:
                    System.out.println("Die gesuchte Zahl ist grösser!");
                    break;
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
