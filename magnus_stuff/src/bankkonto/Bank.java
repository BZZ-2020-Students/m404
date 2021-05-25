package bankkonto;

import java.util.ArrayList;
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
     * creat, add, remove money from Konto
     */
    private void run() {
        ArrayList<Konto> konten = new ArrayList<>();
        konten.add(new Konto("Magnus", 1000.0, "CH10000115201602", "Zürich"));
        konten.add(new Konto("Marc", 600.0, "CH100001981565502", "Altstetten"));
        konten.add(new Konto("Tim", 1500, "CH10000105165160", "Bern"));

        for(Konto k : konten) {
            k.einzahlen(840.0, "Lohn");
        }
        konten.get(0).auszahlen(200.0, "Monatliche allgemeine Ausgaben.");
        konten.get(0).auszahlen(3.90, "Brötchen und Wasser kaufen");
        konten.get(0).auszahlen(3.90, "Brötchen und Wasser kaufen");
        konten.get(0).auszahlen(2.50, "Donut kaufen");
        konten.get(0).auszahlen(11.20, "Mittagessen kaufen");
        konten.get(0).auszahlen(50.0, "Benzin kosten");
        konten.get(1).auszahlen(230.0, " Monatliche allgemeine Ausgaben.");
        konten.get(1).auszahlen(4.90,"Rahmennudeln kaufen");
        konten.get(1).auszahlen(2.90, "Getränk kaufen");
        konten.get(1).auszahlen(18.60,"Mittagessen im Restaurant");
        konten.get(1).auszahlen(8.90, "Einkaufen");
        konten.get(1).auszahlen(120.0,"Bahn ausgaben");
        konten.get(2).auszahlen(200.0, " Monatliche allgemeine Ausgaben.");
        konten.get(2).auszahlen(2.20, "Muffin kaufen");
        konten.get(2).auszahlen(2.50,"Donut kaufen");
        konten.get(2).auszahlen(3.70,"Brötchen mit Butter");
        konten.get(2).auszahlen(22.20,"Computer kosten");

        for(Konto k : konten){
            System.out.println(k.toString());
        }

        System.out.println(konten.get(0).showHistory());

    }
}
