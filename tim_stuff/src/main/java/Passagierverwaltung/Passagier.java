package Passagierverwaltung;

import java.time.LocalDate;

public class Passagier {
    int sitzReihe;
    int sitzNummer;
    private String sitzNummerString;
    private String name;
    private String vorname;
    private LocalDate geburtsDatum;
    private char state; // * = normal, X = corona infected, O = close to corona infected

    public Passagier(int sitzReihe, int sitzNummer, String name, String vorname, LocalDate geburtsDatum, char state) {
        this.sitzReihe = sitzReihe;
        this.sitzNummer = sitzNummer;
        this.name = name;
        this.vorname = vorname;
        this.geburtsDatum = geburtsDatum;
        this.state = state;

        this.sitzNummerString = "Reihe " + sitzReihe + " Platz " + sitzNummer;
    }

    @Override
    public String toString() {
        return vorname + " " + name + " Sitz{" + sitzReihe + "/" + sitzNummer + "}";
    }

    public int getSitzReihe() {
        return sitzReihe;
    }

    public void setSitzReihe(int sitzReihe) {
        this.sitzReihe = sitzReihe;
    }

    public int getSitzNummer() {
        return sitzNummer;
    }

    public void setSitzNummer(int sitzNummer) {
        this.sitzNummer = sitzNummer;
    }

    public String getSitzNummerString() {
        return sitzNummerString;
    }

    public void setSitzNummerString(String sitzNummerString) {
        this.sitzNummerString = sitzNummerString;
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
}
