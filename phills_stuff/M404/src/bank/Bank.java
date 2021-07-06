package bank;

import auto.Auto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Bank() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Bank program = new Bank();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        double abhebebetrag = 0;
        double einzahlbetrag = 0;

        Konto kont1 = new Konto("Fredi Keller", 30000, 123456);
        Konto kont2 = new Konto("Franz Keller", 50000, 654321);

        Konto konten[] = {kont1, kont2};


        for (int y = 0; y < 5; y++) {


            for (int i = 0; i < 2; i++) {
                int kunde = 1;
                kunde += i;

                System.out.println("Kunde " + kunde + ":");
                System.out.println("Wie viel möchten Sie abheben? ");
                abhebebetrag = scanner.nextDouble();
                System.out.println("Wie viel möchten Sie einzahlen? ");
                einzahlbetrag = scanner.nextDouble();
                System.out.println();
                konten[i].abheben(abhebebetrag);
                konten[i].einzahlen(einzahlbetrag);
                konten[i].ausgeben();
                System.out.println();
            }
        }
    }
}
