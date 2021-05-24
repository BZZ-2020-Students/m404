package bankkonto;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    static Scanner scanner;
    ArrayList<Konto> konten = new ArrayList<>();

    public Bank() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();
        scanner.close();
    }

    private void run() {
        Konto kontoPhillip = new Konto("CH-93 4788 4773 5788 9", getRandValue(10000000, false), "Phillip", "Jerebic", "Herr", false, "CHF");
        Konto kontoMagnus = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Magnus", "Götz", "Herr", false, "CHF");
        Konto kontoTim = new Konto("CH-93 4788 4662 4378 6", getRandValue(10000000, false), "Tim", "Irmler", "Herr", false, "CHF");
        Konto kontoMarc = new Konto("CH-93 4788 8364 2925 3", getRandValue(10000000, false), "Marc", "Fuchs", "Herr", false, "CHF");
        Konto kontoLoic = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Loic", "Flückiger", "Herr", false, "CHF");
        Konto kontoAlyssa = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Alyssa", "Heimlicher", "Frau", false, "CHF");
        konten.add(kontoPhillip);
        konten.add(kontoMagnus);
        konten.add(kontoTim);
        konten.add(kontoMarc);
        konten.add(kontoLoic);
        konten.add(kontoAlyssa);

        for (int i = 0; i < 30; i++) {
            ueberweisung(konten.get(getRandValue(5, true)), konten.get(getRandValue(5, true)), getRandValue(100000, false));
        }
    }

    private void ueberweisung(Konto ausgangsKonto, Konto empfaenger, double betrag) {
        ausgangsKonto.zahlung(betrag);
        empfaenger.einzahlung(betrag);
        System.out.println("Überweisungo erfolgreich ausgeführt");
        System.out.println("Der Kontostand von: " + ausgangsKonto.getOwner() + " beträgt nun: " + ausgangsKonto.getVermoegen());
        System.out.println("Der Kontostand von: " + empfaenger.getOwner() + " beträgt nun: " + empfaenger.getVermoegen() + "\n");
    }

    public int getRandValue(int area, boolean incluedsNull) {
        if (!incluedsNull) {
            return (int) (Math.random() * area + 1);
        } else {
            return (int) (Math.random() * area);
        }

    }

    public ArrayList<Konto> getMostVermoegen(ArrayList<Konto> konten) {
        konten.sort();
    }
}
