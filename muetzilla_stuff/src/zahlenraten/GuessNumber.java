package zahlenraten;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author
 * @version 1.0
 * @date 2021.05.18
 */
public class GuessNumber {

    // declare attributes
    static Scanner scanner;
    static Integer secret;

    /**
     * constructor: initialize attributes
     */
    public GuessNumber() {
        scanner = new Scanner(System.in);
        secret = (int) (Math.random() * 100 + 1);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
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
        Integer trys = new Integer(1);
        Integer max = new Integer(100);
        Integer min = new Integer(1);
        System.out.print("Hallo, versuchen Sie die Zahl (" + min + "-" + max + ") zu erraten!\nGeben Sie Ihren ersten Versuch ein > ");
        int input = scanner.nextInt();
        scanner.nextLine();
        while (input > 100 || input < 1) {
            System.out.println("Bitte eine gültige Zahl eingeben > ");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        do {
            if (input < secret) {
                min = input;
                System.out.println("Die gesuchte Zahl ist grösser als " + input + " Eingabebereich : " + min + "-" + max);
                System.out.print("Versuchen Sie es erneut > ");
                input = scanner.nextInt();
                scanner.nextLine();
                while (input > max || input < min) {
                    System.out.print("Ihre Eingabe ist nicht im Zahlenbereich. Bitte versuchen Sie es erneut > ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                }

            } else if (input > secret) {
                max = input;
                System.out.println("Die gesuchte Zahl ist kleiner als " + input + " Eingabebereich : " + min + "-" + max);
                System.out.print("Versuchen Sie es erneut > ");
                input = scanner.nextInt();
                scanner.nextLine();
                while (input > max || input < min) {
                    System.out.print("Ihre Eingabe ist nicht im Zahlenbereich. Bitte versuchen Sie es erneut > ");
                    input = scanner.nextInt();
                    scanner.nextLine();
                }
            }
            trys++;
        } while (input != secret);
        System.out.println("Gratulation! Sie haben die Zahl erraten. Sie haben dafür " + trys + " Versuche benötigt!");
    }
}
