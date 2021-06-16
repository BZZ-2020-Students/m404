package roemicheZahlen;

import scannen.Scann;

/**
 * translate decimal to roman chars
 *
 * @author Magnus Götz
 * @since 2021-06-15
 * @version 1.0
 */

public class Umwandler {
    public static void main(String[] args) {
        new Umwandler().run();
    }

    public void run() {
        Scann scann = new Scann();

        System.out.print("Gib eine Zahl ein > ");
        int number = scann.readInt();
        while (number > 9999 || number < 1) {
            System.out.println("Die Zahl muss zwischen 1 und 9999 liegen!");
            System.out.print("Gib eine Zahl ein > ");
            number = scann.readInt();
        }
        System.out.println(umwandeln(number));
    }

    /**
     * Wandelt die Zahl in die römischen Zahlzeichen um
     * @param zahl   Umzuwandelnde Zahl
     * @return Römische Zahlzeichen
     */
    private String umwandeln(int zahl) {
        String roemisch = "";

        int[] werte = { 1000, 500, 100, 50, 10, 5, 1 };
        char[] zeichen = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

        int index = 0;
        while (zahl > 0) {
            if (zahl >= werte[index]) {
                zahl = zahl - werte[index];
                roemisch += zeichen[index];
            } else {
                index++;
            }

        }
        return roemisch;
    }
}
