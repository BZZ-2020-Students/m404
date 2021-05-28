package notenVerwaltung;

public class Schueler {
    Fach[] faecher;
    String name;
    String vorname;
    String geburtsdatum;
    String geschlecht;

    public void addFach(Fach fach) {
        if (faecher != null) {
            Fach[] newfacher = new Fach[faecher.length + 1];
            for (int i = 0; i < faecher.length; i++) {
                newfacher[i] = faecher[i];
            }
            newfacher[faecher.length] = fach;
            this.faecher = newfacher;
        } else {
            faecher = new Fach[]{fach};
        }

    }

    public Fach getFach(String name) {
        Fach fach = null;
        for (int i = 0; i < faecher.length; i++) {
            if (faecher[i].getName().equalsIgnoreCase(name)) {
                fach = faecher[i];
            }
        }
        return fach;
    }

    public void printFaecher() {
        System.out.println("\nAlle Fächer von " + vorname + " " + name + ": ");
        for (int i = 0; i < faecher.length; i++) {
            System.out.println(faecher[i].getName() + " " + faecher[i].getSchuljahr() + " " + faecher[i].getSemester() + " Semester: " + faecher[i].printNoteString());
        }
    }

    public Schueler() {
    }

    public Schueler(String name, String vorname, String geburtsdatum, String geschlecht) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
    }

    public Schueler(Fach[] faecher, String name, String vorname, String geburtsdatum, String geschlecht) {
        this.faecher = faecher;
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
    }

    public Fach[] getFaecher() {
        return faecher;
    }

    public void setFaecher(Fach[] faecher) {
        this.faecher = faecher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}
