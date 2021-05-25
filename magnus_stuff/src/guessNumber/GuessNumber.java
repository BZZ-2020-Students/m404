package guessNumber;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Magnus Götz
 * @date 2021.05.18
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
        int target = secret;
        int versuch = 0;
        int count = 0;
        int[] hilfe = new int[2];
        hilfe[0] = 1;
        hilfe[1] = 100;

        System.out.println("Hallo versuche eine Zahl zwischen (1-100) zu finden");
        while (target != versuch){
            System.out.print("Bitte gib hier deine Zahl ein ("+hilfe[0]+"-"+hilfe[1]+") >");
            count++;
            versuch = scanner.nextInt();
            if(target > versuch){
                System.out.println("Die Gesuchte Zahl ist grösser\n");
                if(hilfe[0] < versuch){
                    hilfe[0] = versuch;
                }
            }else if (target < versuch){
                System.out.println("Die Gesuchte Zahl ist kleiner\n");
                if(hilfe[1] > versuch){
                    hilfe[1] = versuch;
                }
            }
        }
        System.out.println("Gratulation du hasst die Zahl beim "+ count + " Versuch erraten:)");
    }
}
