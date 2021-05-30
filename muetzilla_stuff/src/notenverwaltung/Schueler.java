package notenverwaltung;

import java.util.Date;

public class Schueler {
    private Fach[] faecher;
    private String name;
    private String vorname;
    private String gelschecht;
    private Date gebDatum;

    public Schueler() {
    }

    public Schueler(Fach[] faecher, String name, String vorname, String gelschecht, Date gebDatum) {
        this.faecher = faecher;
        this.name = name;
        this.vorname = vorname;
        this.gelschecht = gelschecht;
        this.gebDatum = gebDatum;
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

    public String getGelschecht() {
        return gelschecht;
    }

    public void setGelschecht(String gelschecht) {
        this.gelschecht = gelschecht;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(Date gebDatum) {
        this.gebDatum = gebDatum;
    }

    public String printFacher() {
        String printFeacher = "";
        for (int i = 0; i < faecher.length; i++) {
            printFeacher += faecher[i].toString() + "\n";
            faecher[i].calculateAverageNote();
        }
        return printFeacher;
    }

    public void addFach(Fach f) {
        Fach[] faecherNew = new Fach[faecher.length + 1];
        for (int i = 0; i < faecher.length; i++) {
            faecherNew[i] = faecher[i];
        }
        faecherNew[faecherNew.length - 1] = f;
        faecher = faecherNew;
    }

    public String printFaecherJustName() {
        String printFeacherJustName = "";
        for (int i = 0; i < faecher.length; i++) {
            printFeacherJustName += "\n" + (i + 1) + "." + faecher[i].toStringNameAndAverage();
        }
        return printFeacherJustName;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nVorname: " + vorname + "\nNachname: " + name + "\nGeschlecht: " + gelschecht + "\nGeburtsdatum: " + gebDatum + "\nFächer: \n" + printFacher();
    }

    public String toStringNoFaecher() {
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nVorname: " + vorname + "\nNachname: " + name + "\nGeschlecht: " + gelschecht + "\nGeburtsdatum: " + gebDatum;
    }
}
