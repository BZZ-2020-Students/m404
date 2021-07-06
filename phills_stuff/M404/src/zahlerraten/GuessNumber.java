package zahlerraten;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Ibid umm
 * @version 1.0
 * @date yyyy-mm-dd
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
        Integer anzVersuche = new Integer(1);
        Integer maxZahl = new Integer(100);
        Integer minZahl = new Integer(1);
        Integer eingabe;
        System.out.println("Hallo, versuche die geheime Zahl zu erraten");
        /*System.out.println("Geben Sie die min Zahl ein: ");
        minZahl = scanner.nextInt();
        System.out.println("Geben Sie die max Zahl ein: ");
        maxZahl = scanner.nextInt();

        */
        System.out.println("Versuch Nr: " + anzVersuche);
        System.out.println("Eingabe zwischen (" + minZahl + " - " + maxZahl + ") :");
        eingabe = scanner.nextInt();
        Integer zufallZahl = secret;
        while (zufallZahl.intValue() != eingabe.intValue()) {
            if (zufallZahl.intValue() > eingabe.intValue()) {
                System.out.println("Gesuchte Zahl ist grösser!");
                minZahl = eingabe;

            } else {
                System.out.println("Gesuchte Zahl ist kleiner!");
                maxZahl = eingabe;
            }
            anzVersuche++;
            System.out.println("Versuch Nr: " + anzVersuche);
            System.out.println("Neue Eingabe zwischen (" + minZahl + " - " + maxZahl + ") :");
            eingabe = scanner.nextInt();

        }
        System.out.println("Gratuliere! Du hast die Zahl in " + anzVersuche + " Versuchen erraten");
    }
}