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
        Konto konto1 = new Konto("CH-93 4788 4773 5788 9", getRandValue(10000000, false), "Max", "Mustermann", "Herr", false, "CHF");
        Konto konto2 = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Marta", "Meier", "Frau", false, "CHF");
        Konto konto3 = new Konto("CH-93 4788 4662 4378 6", getRandValue(10000000, false), "Heidi", "Schmied", "Frau", false, "CHF");
        Konto konto4 = new Konto("CH-93 4788 8364 2925 3", getRandValue(10000000, false), "Heinz", "Muster", "Herr", false, "CHF");
        Konto konto5 = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Peter", "Becker", "Herr", false, "CHF");
        Konto konto6 = new Konto("CH-93 4788 4734 8456 1", getRandValue(10000000, false), "Markus", "Maier", "Frau", false, "CHF");
        konten.add(konto1);
        konten.add(konto2);
        konten.add(konto3);
        konten.add(konto4);
        konten.add(konto5);
        konten.add(konto6);

        for (int i = 0; i < 30; i++) {
            ueberweisung(konten.get(getRandValue(5, true)), konten.get(getRandValue(5, true)), getRandValue(100000, false));
        }
        for (int i = 0; i < konten.size(); i++) {
            System.out.println(konten.get(i).toString());
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

    /*public ArrayList<Konto> getMostVermoegen(ArrayList<Konto> konten) {

        konten.sort();
        return konten;
    }*/
}