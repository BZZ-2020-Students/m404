package notenverwaltung;


import scanner.Scan;

import java.util.Calendar;

public class Schule {
    Scan scanner;
    Schueler[] schueler = new Schueler[5];

    public Schule() {
        scanner = new Scan();
    }

    public static void main(String[] args) {
        Schule schule = new Schule();
        schule.run();

    }

    public void run() {
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
                    "\n2.Alle Fächer eines Schülers anzeigen" +
                    "\n3.Den Durchschnitt eines Schülers in einem Fach anzeigen" +
                    "\n4.Einem Schüler eine Note hinzufügen" +
                    "\n5.Einem Schüler ein Fach hinzufügen" +
                    "\n6.Alle Schüler mit allen Fächern/Noten ausgeben" +
                    "\n7.Einen Schüler hinzufügen" +
                    "\nGeben Sie die Zahl der Aktivität ein, welche Sie ausführen möchten >");
            input = scanner.scanInt();
        } while (input > 6 || input < 1);
        switch (input) {
            case 1 -> showSchueler();
            case 2 -> showFaecherOneSchueler(selectSchueler(), true);
            case 3 -> showAverage();
            case 4 -> addNote();
            case 5 -> addFach();
            case 6 -> showAll();
        }
    }

    private void showAll() {
        System.out.println("\n#######################################################\n" +
                "Alle Eingaben: \n");
        for (int i = 0; i < schueler.length; i++) {
            System.out.println(schueler[i].toString());
        }
    }

    private void addFach() {

    }

    private void addNote() {
        showSchueler();
        int schuelerIndex = selectSchueler();
        int fachIndex = selectFach(schuelerIndex);


    }

    private void showAverage() {
        int schuelerIndex = selectSchueler();
        Fach[] faecher = schueler[schuelerIndex - 1].getFaecher();
        String averageFaecher = "";
        for (int i = 0; i < faecher.length; i++) {
            averageFaecher += faecher[i].toStringNameAndAverage();
        }
        System.out.println("\n#######################################################\n" +
                "Durchschnitte von " + schueler[schuelerIndex - 1].getVorname() + " " + schueler[schuelerIndex - 1].getName() + ": \n" + averageFaecher);
    }

    private int selectFach(int index) {
        Schueler s = schueler[index];
        int input;
        do {
            System.out.println("\n#######################################################");
            System.out.println("Wählen Sie das Fach aus: ");
            showFaecherOneSchueler(index, false);
            System.out.print("Geben Sie die Nummer des gewünschten Faches ein > ");
            input = scanner.scanInt();
        } while (input > s.getFaecher().length || input < 1);
        return input;
    }

    private void showFaecherOneSchueler(int schuelerIndex, boolean alInfos) {
        if (alInfos) {
            System.out.println("\n#######################################################\n" +
                    "Alle Fächer: \n" + schueler[schuelerIndex - 1].printFacher());
        } else {
            System.out.println("\n#######################################################\n" +
                    "Alle Fächer: \n" + schueler[schuelerIndex - 1].printFaecherJustName());
        }
    }

    private void showSchueler() {
        System.out.println("\n#######################################################\n" +
                "Alle Schüler: \n");
        for (int i = 0; i < schueler.length; i++) {
            System.out.println(schueler[i].toStringNoFaecher());
        }
    }

    private int selectSchueler() {
        int input;
        do {
            System.out.println("\n#######################################################");
            System.out.println("Wählen Sie den Schüler aus: ");
            showSchuelerJustName();
            System.out.print("Geben Sie die Nummer des gewünschten Schülers ein > ");
            input = scanner.scanInt();
        } while (input > schueler.length || input < 1);
        return input;
    }

    private void showSchuelerJustName() {
        for (int i = 0; i < schueler.length; i++) {
            System.out.println(i + 1 + "." + schueler[i].getVorname() + " " + schueler[i].getName());
        }
    }
}