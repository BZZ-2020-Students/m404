package pythagoras;

import scanner.Scan;

/**
 * short description of this program
 *
 * @author
 * @version 1.0
 * @date 2021.06.01
 */
public class Pythagoras {
    Scan scanner;

    public Pythagoras() {
        scanner = new Scan();
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Pythagoras pythagoras = new Pythagoras();
        pythagoras.run();
    }

    public void run() {
        String seiteA;
        
        System.out.print("Willkommen beim Pythagoras Rechner\n###############################################\nGeben Sie zwei der 3 Längen an. In der letzen geben Sie ein ? ein > ");
        System.out.print("Seite a > ");
        seiteA = scanner.scanString();
        System.out.print("Seite b > ");

    }
}
