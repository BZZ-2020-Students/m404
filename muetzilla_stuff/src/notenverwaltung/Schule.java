package notenverwaltung;


import scanner.Scan;

import java.util.Calendar;

public class Schule {
    Scan scanner;

    public Schule() {
        scanner = new Scan();
    }

    public static void main(String[] args) {
        Schule schule = new Schule();
        schule.run();

    }

    public void run() {
        Schueler[] schueler = new Schueler[5];
        String[] vorname = {"Max", "Marta", "Peter", "Heidi", "Markus"};
        String[] nachname = {"Mustermann", "Meier", "Schmied", "Muster", "Becker"};
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
            //  System.out.println(faecher[i].toString());
        }
        for (int i = 0; i < schueler.length; i++) {
            schueler[i] = new Schueler(faecher, nachname[getRandValue(nachname.length, true)], vorname[getRandValue(vorname.length, true)], "M", Calendar.getInstance().getTime());
            //  System.out.println(schueler[i].toString());
        }
        userAuswahl();
    }

    public int getRandValue(int area, boolean incluedsNull) {
        if (!incluedsNull) {
            return (int) (Math.random() * area + 1);
        } else {
            return (int) (Math.random() * area);
        }
    }

    public void userAuswahl() {
        int input = 0;
        do {
            System.out.print("Was möchten Sie tun?" +
                    "\n1.Alle Schüler anzeigen" +
                    "\n2.Alle Fächer anzeigen" +
                    "\n3.Den Durchschnitt eines Schülers in einem Fach anzeigen" +
                    "\n4.Einem Schüler eine Note hinzufügen" +
                    "\n5.Einem Schüler ein Fach hinzufügen" +
                    "\n6.Alle Schüler mit allen Fächern/Noten ausgeben" +
                    "\nGeben Sie die Zahl der Aktivität ein, welche Sie ausführen möchten >");
            input = scanner.scanInt();
        } while (input > 6 || input < 1);
        switch (input) {
            case 1:
                showSchueler();
                break;
            case 2:
                showFaecher();
                break;
            case 3:
                showAverage();
                break;
            case 4:
                addNote();
                break;
            case 5:
                addFach();
                break;
            case 6:
                showAll();
                break;
        }
    }

    private void showAll(Schueler[] schueler) {
        System.out.println("#######################################################\n" +
                "Alle Schüler: \n");
        for (int i = 0; i < schueler.length; i++) {
            System.out.println(schueler[i].toString());
        }
    }

    private void addFach() {

    }

    private void addNote() {

    }

    private void showAverage() {

    }

    private void showFaecher() {

    }

    private void showSchueler() {
    }
}
