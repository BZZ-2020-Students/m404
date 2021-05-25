package notenVerwaltung;

import java.time.LocalDate;

public class Schule {
    public static void main(String[] args) {
        new Schule().run();
    }

    public void run() {
        Schueler magnus = new Schueler(new Fach[]{new Fach(new Note[]{new Note(5.5, LocalDate.of(2020, 10, 18), 1)}, "Mahtematik", 1, 2020)}, "Goetz", "Magnus", "27.07.2004", "Mann");
        Schueler marc = new Schueler("Fuchs", "Marc", "16.05.2004", "Mann");
        Fach mathe = new Fach("Mathematik", 1, 2020);
        Fach englisch = new Fach("Englisch", 2, 2021);
        mathe.addNote(new Note(5.6, LocalDate.of(2020, 9, 18), 1));
        englisch.addNote(new Note(5.0, LocalDate.of(2021, 3, 2), 2));
        englisch.addNote(new Note(4.75, LocalDate.of(2021, 4, 20), 1));
        englisch.printNote();
        marc.addFach(mathe);
        marc.addFach(englisch);
        marc.printFaecher();
        magnus.printFaecher();
    }
}
