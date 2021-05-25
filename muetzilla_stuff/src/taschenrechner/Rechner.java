package taschenrechner;

import scanner.Scan;

public class Rechner {
    public Rechner() {
    }

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        rechner.run();
    }

    public void run() {
        Scan scanner = new Scan();
        System.out.println("Herzlich Wilkommen zum Taschenrechner" +
                "\n**************************************");
        System.out.print("Geben Sie Ihre erste Zahl ein > ");

    }
}
