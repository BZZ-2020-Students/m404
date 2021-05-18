package auto;

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
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Autogarage program = new Autogarage();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {

        System.out.println();
        System.out.println("1. Fahrzeug");
        Auto auto1 = new Auto();
        auto1.setLeistung(350);
        auto1.setFarbe("Orange");
        auto1.setMarke("Lamborghini");
        auto1.setModell("Miura");
        auto1.setKraftstoffmenge(90);
        auto1.setKennzeichen("986624");
        System.out.println(auto1.getKraftstoffmenge());
        auto1.fahren();
        System.out.println(auto1.getKraftstoffmenge());
        auto1.tanken();
        System.out.println(auto1.getKraftstoffmenge());
        System.out.println(auto1.getMarke());
        System.out.println(auto1.getModell());
        System.out.println(auto1.getFarbe());
        System.out.println(auto1.getLeistung());
        System.out.println(auto1.getKraftstoffmenge());
        System.out.println(auto1.getKennzeichen());


        System.out.println();
        System.out.println("2. Fahrzeug");
        Auto auto2 = new Auto();
        auto2.setLeistung(286);
        auto2.setFarbe("Silber");
        auto2.setMarke("Aston Martin");
        auto2.setModell("DB5");
        auto2.setKraftstoffmenge(86.4);
        auto2.setKennzeichen("000007");
        System.out.println(auto2.getKraftstoffmenge());
        auto2.fahren();
        System.out.println(auto2.getKraftstoffmenge());
        auto2.tanken();
        System.out.println(auto2.getKraftstoffmenge());
        System.out.println(auto2.getMarke());
        System.out.println(auto2.getModell());
        System.out.println(auto2.getFarbe());
        System.out.println(auto2.getLeistung());
        System.out.println(auto2.getKraftstoffmenge());
        System.out.println(auto2.getKennzeichen());

        System.out.println();
        System.out.println("3. Fahrzeug");
        Auto auto3 = new Auto();
        auto3.setLeistung(478);
        auto3.setFarbe("Rot");
        auto3.setMarke("Ferrari");
        auto3.setModell("F40");
        auto3.setKraftstoffmenge(120);
        auto3.setKennzeichen("40500");
        System.out.println(auto3.getKraftstoffmenge());
        auto3.fahren();
        System.out.println(auto3.getKraftstoffmenge());
        auto3.tanken();
        System.out.println(auto3.getKraftstoffmenge());
        System.out.println(auto3.getMarke());
        System.out.println(auto3.getModell());
        System.out.println(auto3.getFarbe());
        System.out.println(auto3.getLeistung());
        System.out.println(auto3.getKraftstoffmenge());
        System.out.println(auto3.getKennzeichen());

        System.out.println();
        System.out.println("4. Fahrzeug");
        Auto auto4 = new Auto();
        auto4.setLeistung(485);
        auto4.setFarbe("Weiss");
        auto4.setMarke("Ford");
        auto4.setModell("GT40");
        auto4.setKraftstoffmenge(125.5);
        auto4.setKennzeichen("162340");
        System.out.println(auto4.getKraftstoffmenge());
        auto4.fahren();
        System.out.println(auto4.getKraftstoffmenge());
        auto4.tanken();
        System.out.println(auto4.getKraftstoffmenge());
        System.out.println(auto4.getMarke());
        System.out.println(auto4.getModell());
        System.out.println(auto4.getFarbe());
        System.out.println(auto4.getLeistung());
        System.out.println(auto4.getKraftstoffmenge());
        System.out.println(auto4.getKennzeichen());
    }
}