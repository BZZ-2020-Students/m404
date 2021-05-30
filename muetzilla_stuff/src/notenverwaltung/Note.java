package notenverwaltung;

import java.time.LocalDate;

public class Note {

    private float wert;
    private LocalDate datum;
    private float gewichtung;

    public Note() {
    }

    public Note(float wert, LocalDate datum, float gewichtung) {
        this.wert = wert;
        this.datum = datum;
        this.gewichtung = gewichtung;
    }

    public float getWert() {
        return wert;
    }

    public void setWert(float wert) {
        this.wert = wert;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public float getGewichtung() {
        return gewichtung;
    }

    public void setGewichtung(float gewichtung) {
        this.gewichtung = gewichtung;
    }

    @Override
    public String toString() {
        return "Note: " + wert + " Datum: " + datum + " Gewichtung: " + gewichtung;
    }
}
