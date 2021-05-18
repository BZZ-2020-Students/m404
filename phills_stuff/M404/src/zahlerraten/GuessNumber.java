package zahlerraten;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Ibid umm
 * @date yyyy-mm-dd
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
        System.out.println("Hallo, versuche die geheime Zahl zu erraten");
        System.out.println("Eingabe:");
        int eingabe = scanner.nextInt();
        Integer zufallZahl = secret;
        while(zufallZahl != eingabe) {
           if(zufallZahl > eingabe){
               System.out.println("Gesuchte Zahl ist grösser!");
           }else {
               System.out.println("Gesuchte Zahl ist kleiner!");
           }
            System.out.println("Neue eingabe");
            eingabe = scanner.nextInt();
        }
        System.out.println("Gratuliere! Du hast die Zahl in " + "");
    }
}