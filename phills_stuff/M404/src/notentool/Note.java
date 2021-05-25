package notentool;

import java.util.Date;

public class Note {

    private double wert;
    private Date datum;
    private double gewichtung;

    public Note(double wert, Date datum, double gewichtung) {
        this.wert = wert;
        this.datum = datum;
        this.gewichtung = gewichtung;
    }

    public double getGewichtung() {
        return gewichtung;
    }

    public void setGewichtung(double gewichtung) {
        this.gewichtung = gewichtung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }
}
