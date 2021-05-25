package taschenrechner;

import scannen.Scann;

public class Rechner {
    public static void main(String[] args) {
        new Rechner().run();
    }
    public void run(){
        Scann scann = new Scann();
        System.out.print("Gib den ersten Wert ein > ");
        double wert1 = scann.readDouble();
        System.out.print("Gib das Rechenzeichen ein > ");
        String zeichen = scann.readString();
        System.out.println("Gib den zweiten Wert ein > ");
        double wert2 = scann.readDouble();

        System.out.println("ergebnis: sie sind ein stück scheisse");
    }
}
