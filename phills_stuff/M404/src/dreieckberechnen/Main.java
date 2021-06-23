package dreieckberechnen;

import java.util.Scanner;
//import scanner.Einleser;

public class Main {
    // declare attributes
    static Scanner scanner;
    Einleser einlesen;
    Berechnung berechnung;

    /**
     * constructor: initialize attributes
     */
    public Main() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        berechnung = new Berechnung();
        einlesen = new Einleser();
        String a;
        String b;
        String c;


        System.out.println("Geben Sie die Seiten ein. Geben Sie der Gesuchten Seite ein ?");
        System.out.print("Seite a: = >");
        a = einlesen.readString();
        System.out.print("Seite b: = >");
        b = einlesen.readString();
        System.out.print("Seite c: = >");
        c = einlesen.readString();

        if (a.equals("?")) {
            berechnung.berechnena(b, c);
        } else if (b.equals("?")) {
            berechnung.berechnenb(a, c);
        } else if (c.equals("?")) {
            berechnung.berechnenc(a, b);
        } else {
            System.out.println("Sie müssen ein ? platzieren");
        }
    }
}
