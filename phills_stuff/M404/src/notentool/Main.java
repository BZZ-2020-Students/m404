package notentool;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        Note[] noten = {
                new Note(5, new Date(), 0.5),
                new Note(4, new Date(), 0.5),
                new Note(6, new Date(), 1)
        };
        Note[] notenEn = {
                new Note(5.5, new Date(), 1),
                new Note(4.5, new Date(), 0.5),
                new Note(6, new Date(), 1)
        };

        Fach[] faecher = {
                new Fach(noten, "Deutsch", 2, 2005),
                new Fach(notenEn, "Englisch", 2, 2005)
        };

        Note[] notens2 = {
                new Note(5.7, new Date(), 0.5),
                new Note(2.8, new Date(), 0.5),
                new Note(6, new Date(), 1)
        };
        Note[] notenEns2 = {
                new Note(5.8, new Date(), 1),
                new Note(4, new Date(), 0.5),
                new Note(3.75, new Date(), 1)
        };

        Fach[] faechers2 = {
                new Fach(notens2, "Deutsch", 2, 2005),
                new Fach(notenEns2, "Englisch", 2, 2005)
        };

        Schueler s1 = new Schueler(faecher, "Mustermann", "Sebastian", "01.02.2007", "Männlich");
        Schueler s2 = new Schueler(faechers2, "Mustermann", "Max", "01.02.2007", "Männlich");

        System.out.println("Nachname: " + s1.getName() + "\nVorname: " + s1.getVorname() + "\nGeburtstag: " + s1.getGeburtstag());
        s1.printFaecher();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nachname: " + s2.getName() + "\nVorname: " + s2.getVorname() + "\nGeburtstag: " + s2.getGeburtstag());
        s2.printFaecher();
        System.out.println("------------------------------------------------------------------");
    }

}
