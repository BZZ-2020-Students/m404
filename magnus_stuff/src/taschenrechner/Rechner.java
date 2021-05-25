package taschenrechner;

import scannen.Scann;

import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        new Rechner().run();
    }
    public void run(){
        Scann scann = new Scann();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib den ersten Wert ein > ");
        double wert1 = scann.readDouble();
        System.out.print("Gib das Rechenzeichen ein > ");
        String zeichen = scanner.nextLine();
        System.out.print("Gib den zweiten Wert ein > ");
        double wert2 = scann.readDouble();

        Calculus calculus = new Calculus();
        System.out.println(wert1+ " "+ zeichen + " "+ wert2);
        double ergebnis = calculus.calculate(wert1, zeichen, wert2);

        System.out.println("ergebnis: von "+ wert1 +" "+ zeichen +" "+ wert2 +" ist: " + ergebnis);
    }
}
