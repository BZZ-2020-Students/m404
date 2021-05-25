package notenverwaltung;


import java.util.Calendar;
import java.util.Scanner;

public class Schule {
    static Scanner scanner;

    public Schule() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Schule schule = new Schule();
        schule.run();
        scanner.close();
    }

    public void run() {
        Schueler[] schueler = new Schueler[5];
        String[] vorname = {"Max, Marta, Peter, Heidi, Markus"};
        String[] nachname = {"Mustermann, Meier, Schmied, Muster, Becker"};
        String[] faechernamen = {"Mathematik", "Geografie", "Politik", "Französisch", "Englisch", "Informatik", "Geschite", "Wirtschaft"};
        Fach[] faecher = new Fach[6];
        Note[] noten = {
                new Note(4.5f, Calendar.getInstance().getTime(), 1f),
                new Note(5.5f, Calendar.getInstance().getTime(), 0.75f),
                new Note(1.9f, Calendar.getInstance().getTime(), 0.5f),
                new Note(4.3f, Calendar.getInstance().getTime(), 0.8f),
                new Note(5.2f, Calendar.getInstance().getTime(), 0.25f)
        };
        for (int i = 0; i < faecher.length; i++) {
            faecher[i] = new Fach(noten, faechernamen[i], getRandValue(2, false), getRandValue(4, false));
            System.out.println(faecher[i].toString());
        }

        for (int i = 0; i < schueler.length; i++) {
            schueler[i] = new Schueler();
        }
    }

    public int getRandValue(int area, boolean incluedsNull) {
        if (!incluedsNull) {
            return (int) (Math.random() * area + 1);
        } else {
            return (int) (Math.random() * area);
        }
    }
}
