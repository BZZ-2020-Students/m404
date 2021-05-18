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
        String eingabe = new String();

        System.out.println("");
    }
}