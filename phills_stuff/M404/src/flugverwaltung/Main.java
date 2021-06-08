package flugverwaltung;


import scanner.Einleser;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    // declare attributes
    static Scanner scanner;
    Einleser einlesen;

    /**
     * constructor: initialize attributes
     */
    public Main() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        Einleser einlesen = new Einleser();
        String anzreihenString;
        String anzsitzeString;
        String input = "";
//        String infiziert = "";
        System.out.println("Willkommen bei der Flugverwaltung");
        System.out.print("Anzahl Sitzreihen = > ");
        anzreihenString = einlesen.readString();
        System.out.print("Anzahl Sitze in einer Reihe = > ");
        anzsitzeString = einlesen.readString();


        int anzreihen = Integer.parseInt(anzreihenString);
        int anzsitze = Integer.parseInt(anzsitzeString);
        Passagier[][] passagiere = new Passagier[anzreihen][anzsitze];
//        int jetzigersitzplatz = 0;
        //int sitznummer = anzreihen * anzsitze;
        for (int y = 0; y < anzreihen; y++) {
            for (int i = 0; i < anzsitze; i++) {
                String sitznummer = (y + 1) + "-" + (i + 1);

//                jetzigersitzplatz++;
                LocalDate geburtstag = LocalDate.now();
                Passagier passagier = new Passagier(sitznummer, "Tom " + i, "Nachname" + i, geburtstag, false);

                passagiere[y][i] = passagier;
            }
        }

        System.out.print("Sitznummer des Infizierten = > ");
        input = einlesen.readString();

        String[] inputs = input.split("-");
        int reihe = Integer.parseInt(inputs[0]);
        int sitzplatz = Integer.parseInt(inputs[1]);

        int startX = (sitzplatz - 1) < 0 ? sitzplatz : sitzplatz - 1;
        int startY = (reihe - 1) < 0 ? reihe : reihe - 1;
        int endX = (sitzplatz + 1) < (anzsitze) ? sitzplatz : sitzplatz + 1;
        int endY = (reihe + 1) < (anzreihen) ? reihe : reihe + 1;

        System.out.println("Start{X:"+startX+",Y:"+startY+"},\nEnd{X:"+endX + ",Y:"+endY+"}");

        for (int y = startY; y < endY; y++) {
            for (int x = startX; x < endX; x++) {
                Passagier passagier = passagiere[y][x];
                passagier.setAngesteckt(true);

            }
        }

        for (int y = 0; y < anzreihen; y++) {
            for (int i = 0; i < anzsitze; i++) {
                if (passagiere[y][i].getAngesteckt()) {
                    System.out.println("Vorname: " + passagiere[y][i].getVorname() + " Name: " + passagiere[y][i].getName() + " Sitznummer: " + passagiere[y][i].getSitznummer() + " Geburtstag: " + passagiere[y][i].getGeburtsdatum() + " Angesteckt: " + passagiere[y][i].getAngesteckt());
                }

            }
        }
    }
}

