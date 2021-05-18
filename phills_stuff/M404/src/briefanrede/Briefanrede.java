package briefanrede;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Ibid umm
 * @since yyyy-mm-dd
 * @version 1.0
 */
public class Briefanrede {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Briefanrede() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Briefanrede program = new Briefanrede();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        String anrede;
        String nachname = null;
        String firmenname;

        System.out.println("Gebem Sie ihre Anrede ein: ");
        anrede = scanner.nextLine();
        if(anrede.equals("Herr") || anrede.equals("Frau")){
            System.out.println("Geben Sie ihren Nachnamen ein: ");
            nachname = scanner.nextLine();
        }else{
            System.out.println("Geben Sie ihren Firmennamen ein: ");
            firmenname = scanner.nextLine();
        }


        System.out.println("Sehr geehrte Frau " + nachname);
        System.out.println("Sehr geehrter Herr " + nachname);
        System.out.println("Sehr geehrte Frauen und Herren");
    }
}