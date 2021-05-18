package AutoAufgabe;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.floor;

public class AutoGarage {
    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public AutoGarage() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        AutoGarage program = new AutoGarage();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        int carAmount = 5;
        String[] marken = {"Mercedes","Audi","VW","Ford","BMW"};
        String[] farben = {"Rot","Blau","Grün","Gelb","Schwarz"};
        String[] kennzeichen = {"ZH","SZ","TG","TI","UR"};

        double leistung, kraftstoffmenge;

        Auto[] autos = new Auto[carAmount];
        for(int i=0; i<carAmount; i++) {
            String marke = marken[getRandomIndex(marken.length)];
            String farbe = farben[getRandomIndex(farben.length)];
            String myKennzeichen = kennzeichen[getRandomIndex(kennzeichen.length)] + "-" + (int)(Math.random() * 9999) + 1;
            leistung = floor(Math.random() * 500) + 1;
            kraftstoffmenge = floor(Math.random() * 300) + 1;

            autos[i] = new Auto(i+1, leistung, kraftstoffmenge, farbe, marke, myKennzeichen);
        }

        for(Auto car : autos) {
            System.out.println(car.toString());
            car.fahren(10);
            car.tanken(10);

            System.out.println("\n");
        }
    }

    private int getRandomIndex(int arrayLength) {
        Random r = new Random();
        return r.nextInt(arrayLength);
    }
}