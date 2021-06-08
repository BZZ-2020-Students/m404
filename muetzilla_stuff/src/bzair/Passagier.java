package bzair;

import java.time.LocalDate;

public class Passagier {
    private int sitznummer;
    private String vorname;
    private String nachname;
    private LocalDate gebDatum;
    private boolean positivesTestergebnis;

    public Passagier() {
    }

    public Passagier(int sitznummer, String vorname, String nachname, LocalDate gebDatum, boolean positivesTestergebnis) {
        this.sitznummer = sitznummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDatum = gebDatum;
        this.positivesTestergebnis = positivesTestergebnis;
    }

    public int getSitznummer() {
        return sitznummer;
    }

    public void setSitznummer(int sitznummer) {
        this.sitznummer = sitznummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(LocalDate gebDatum) {
        this.gebDatum = gebDatum;
    }

    public boolean isPositivesTestergebnis() {
        return positivesTestergebnis;
    }

    public void setPositivesTestergebnis(boolean positivesTestergebnis) {
        this.positivesTestergebnis = positivesTestergebnis;
    }

    @Override
    public String toString() {
        return "Vorname: " + vorname + " Nachname: " + nachname + " Sitzplatz: " + sitznummer + " Geburtsdatum: " + gebDatum + " positives Testergebnis: " + positivesTestergebnis;
    }
}
