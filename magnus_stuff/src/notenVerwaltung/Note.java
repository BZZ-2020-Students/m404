package notenVerwaltung;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Note {
    private double wert;
    private LocalDate datum;
    private double gewichtung;

    public Note() {
    }


    public Note(double wert, LocalDate datum, double gewichtung) {
        this.wert = wert;
        this.datum = datum;
        this.gewichtung = gewichtung;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public double getGewichtung() {
        return gewichtung;
    }

    public void setGewichtung(double gewichtung) {
        this.gewichtung = gewichtung;
    }
}
