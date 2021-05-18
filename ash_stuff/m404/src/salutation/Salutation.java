package salutation;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author Ibid umm
 * @since yyyy-mm-dd
 * @version 1.0
 */
public class Salutation {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Salutation() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Salutation program = new Salutation();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        String user;
        String lname;
        String w = "woman";
        String m = "man";
        String c = "company";

        System.out.print("Please enter (woman/man/company) > ");
        user = scanner.nextLine();
        if(user.equalsIgnoreCase(w) || user.equalsIgnoreCase(m)){
            System.out.print("Enter your surname > ");
            lname = scanner.nextLine();
            if (user.equalsIgnoreCase(w)){
                System.out.println("Welcome Mrs. " + lname);
            }else {
                System.out.println("Welcome Mr. " + lname);
            }
        }else if(user.equalsIgnoreCase(c)) {
            System.out.print("Enter your company name > ");
            String cname = scanner.nextLine();
            System.out.println("Welcome ladies and gentlemen of " + cname);
        }
    }
}