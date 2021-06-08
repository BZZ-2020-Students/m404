package ReferenceVariables;

import java.util.Scanner;

/**
 * practice using reference variables
 *
 * @author Marcel Suter
 * @since 2018-05-14
 * @version 1.0
 */
public class RefVar{

    /**
     * constructor: initialize attributes
     */
    public RefVar() {
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        RefVar program = new RefVar();
        program.run();
    }

    /**
     * declare and use some reference variables and objects
     */
    private void run() {
        Integer zahl1, zahl2, zahl3;

        zahl1 = new Integer(1);
        zahl2 = new Integer(1);
        zahl3 = zahl1;

        if(zahl1 == zahl2) { // Checkt ob es auf das selbe Objekt verweist (Referenz Variabeln)
            System.out.println("Referenz Gleich");
        } else {
            System.out.println("Referenz Ungleich");
        }

        if(zahl1 == zahl3) {
            System.out.println("Referenz Gleich");
        } else {
            System.out.println("Referenz Ungleich");
        }

        if(zahl1.equals(zahl2)) { // Checkt ob es den selben Wert hat (Variabel)
            System.out.println("Wert Gleich");
        } else {
            System.out.println("Wert Ungleich");
        }

        if(zahl1.equals(zahl3)) {
            System.out.println("Wert Gleich");
        } else {
            System.out.println("Wert Ungleich");
        }
    }
}