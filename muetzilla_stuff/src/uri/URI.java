package uri;

import pythagoras.Calculation;
import scanner.Scan;

/**
 * short description of this program
 *
 * @author
 * @version 1.0
 * @date 2021.06.01
 */
public class URI {
    Scan scanner;
    Calculation calc;

    public URI() {
        scanner = new Scan();
        calc = new Calculation();
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */

    public static void main(String[] args) {
        URI uri = new URI();
        uri.run();
    }

    public void run() {
        boolean nextCalculation;
        String u;
        String r;
        String i;
        double result = 0;

        do {
            System.out.print("Willkommen beim URI Rechner\n###############################################\nGeben Sie zwei der 3 Grössen an. In der letzen geben Sie ein ? ein.\n");
            System.out.print("U > ");
            u = scanner.scanString();
            System.out.print("R > ");
            r = scanner.scanString();
            System.out.print("I > ");
            i = scanner.scanString();

            if (u.equals("?")) {
                result = calc.seiteA(r, i);
                System.out.println("U beträgt: " + result);
            } else if (r.equals("?")) {
                result = calc.seiteB(u, i);
                System.out.println("R beträgt: " + result);
            } else if (i.equals("?")) {
                result = calc.seiteC(u, r);
                System.out.println("I beträgt: " + result);
            } else {
                System.out.println("Kein ? vorhanden. Bitte versuchen Sie es erneut!");
            }

            System.out.print("Möchten Sie noch eine Berechnung machen (true/false) > ");
            nextCalculation = scanner.scanBoolean();

        } while (nextCalculation);
    }
}
