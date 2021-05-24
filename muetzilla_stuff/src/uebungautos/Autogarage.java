package uebungautos;


import java.util.Scanner;

public class Autogarage {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Autogarage() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Autogarage autogarage = new Autogarage();
        autogarage.run();
        scanner.close();
    }

    /**
     * Es werden 5 Autos erstellt und ihre Werte werden ausgegeben. Ausserdem können diese fahren -> Tank nimmt ab und tanken -> Tank nimmt zu.
     */
    private void run() {
        Auto a1 = new Auto();
        a1.setLeistung(236);
        a1.setFarbe("GELB");
        a1.setKennzeichen("ZH-2366");
        a1.setKraftstoffmenge(125);
        a1.setMarke("PORSCHE");
        Auto a2 = new Auto();
        a2.setLeistung(543);
        a2.setFarbe("GRÜN");
        a2.setKennzeichen("ZH-62347");
        a2.setKraftstoffmenge(755);
        a2.setMarke("VW");
        Auto a3 = new Auto();
        a3.setLeistung(145);
        a3.setFarbe("BLAU");
        a3.setKennzeichen("ZH-2575");
        a3.setKraftstoffmenge(839);
        a3.setMarke("MERCEDES");
        Auto a4 = new Auto();
        a4.setLeistung(437);
        a4.setFarbe("GRAU");
        a4.setKennzeichen("ZH-34688");
        a4.setKraftstoffmenge(882);
        a4.setMarke("BMW");
        Auto a5 = new Auto();
        a5.setLeistung(123);
        a5.setFarbe("WEISS");
        a5.setKennzeichen("ZH-348883");
        a5.setKraftstoffmenge(822);
        a5.setMarke("AUDI");

        Auto[] autos = {a1, a2, a3, a4, a5};
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i].toString());
            autos[i].fahren(112);
            autos[i].tanken(153);
        }
    }
}
