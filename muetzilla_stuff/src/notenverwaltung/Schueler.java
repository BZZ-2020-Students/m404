package notenverwaltung;

import java.util.Date;

public class Schueler {
    private Fach[] faecher = new Fach[2];
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
}
