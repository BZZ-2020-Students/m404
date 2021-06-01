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
    Calculation calc;

    public Pythagoras() {
        scanner = new Scan();
        calc = new Calculation();
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
        String seiteB;
        String seiteC;
        double result;
        System.out.print("Willkommen beim Pythagoras Rechner\n###############################################\nGeben Sie zwei der 3 Längen an. In der letzen geben Sie ein ? ein > ");
        System.out.print("Seite a > ");
        seiteA = scanner.scanString();
        System.out.print("Seite b > ");
        seiteB = scanner.scanString();
        System.out.print("Seite c > ");
        seiteC = scanner.scanString();

        if (seiteA.equals("?")) {
            result = calc.seiteA(seiteB, seiteC);
        } else if (seiteB.equals("?")) {

        } else if (seiteC.equals("?")) {

        }
    }
}
