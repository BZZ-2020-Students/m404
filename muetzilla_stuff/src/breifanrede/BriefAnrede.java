package breifanrede;

import java.util.Scanner;

/**
 * short description of this program
 *
 * @author
 * @version 1.0
 * @date 2021.05.18
 */
public class BriefAnrede {
    static Scanner scanner;

    public BriefAnrede() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        breifanrede.BriefAnrede program = new BriefAnrede();
        program.run();
        scanner.close();
    }

    private void run() {
        String anredeFr = "Frau";
        String anredeMa = "Herr";
        String inputName;
        System.out.print("Geben Sie Ihre Anrede ein (Frau, Herr, Firma) > ");
        String inputAnrede = scanner.nextLine();

        if (inputAnrede.equalsIgnoreCase(anredeFr) || inputAnrede.equalsIgnoreCase(anredeMa)) {
            System.out.print("Geben Sie Ihren Nachnamen ein > ");
            inputName = scanner.nextLine();
            if (inputAnrede.equalsIgnoreCase(anredeFr)) {
                System.out.println("Sehr geehrte Frau " + inputName);
            } else {
                System.out.println("Sehr geehrter Herr " + inputName);
            }
        } else {
            System.out.print("Geben Sie Ihren Firmennamen ein > ");
            inputName = scanner.nextLine();
            System.out.println("Sehr geehrte Damen und Herren der Firma " + inputName);
        }

    }
}
