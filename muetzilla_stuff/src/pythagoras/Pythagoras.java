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
        boolean nextTriangel;
        String seiteA;
        String seiteB;
        String seiteC;
        double result = 0;
        do {
            System.out.print("Willkommen beim Pythagoras Rechner\n###############################################\nGeben Sie zwei der 3 Längen an. In der letzen geben Sie ein ? ein.\n");
            System.out.print("Kathete  a > ");
            seiteA = scanner.scanString();
            System.out.print("Kathete b > ");
            seiteB = scanner.scanString();
            System.out.print("Hypotenuse c > ");
            seiteC = scanner.scanString();

            if (seiteA.equals("?")) {
                result = calc.calculateU(seiteB, seiteC);
                System.out.println("Die Länge der Seite a beträgt: " + result);
            } else if (seiteB.equals("?")) {
                result = calc.calculateR(seiteA, seiteC);
                System.out.println("Die Länge der Seite b beträgt: " + result);
            } else if (seiteC.equals("?")) {
                result = calc.calculateI(seiteA, seiteB);
                System.out.println("Die Länge der Seite c beträgt: " + result);
            } else {
                System.out.println("Kein ? vorhanden. Bitte versuchen Sie es erneut!");
            }

            System.out.print("Möchten Sie noch eine Berechnung machen (true/false) > ");
            nextTriangel = scanner.scanBoolean();

        } while (nextTriangel);
    }
}
