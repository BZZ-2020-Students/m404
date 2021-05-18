package bank;

import auto.Auto;

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
     * @param args
     *            command line arguments
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

        Konto kont1 = new Konto("Fredi Keller",30000,123456);
        Konto kont2 = new Konto("Franz Keller",50000,654321);

        Konto konten[] = {kont1,kont2};

        for (int i = 0; i < 2; i++) {
            konten[i].abheben(5000);
            konten[i].einzahlen(2000000);
            konten[i].ausgeben();
        }
    }
}
