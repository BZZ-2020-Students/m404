package flugverwaltung;

import java.time.LocalDate;
import java.util.Date;

public class Passagier {
    private String sitznummer;
    private String name;
    private String vorname;
    private LocalDate geburtsdatum;
    private boolean angesteckt;


//    public Passagier(int sitznummer, String vorname, String name, LocalDate geburtsdatum, boolean angesteckt) {
//        this.sitznummer = sitznummer;
//        this.name = name;
//        this.vorname = vorname;
//        this.geburtsdatum = geburtsdatum;
//        this.angesteckt = angesteckt;
//    }

    public Passagier(String sitznummer, String vorname, String name, LocalDate geburtsdatum, boolean angesteckt) {
        this.sitznummer = sitznummer;
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.angesteckt = angesteckt;
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "sitznummer=" + sitznummer +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", angesteckt=" + angesteckt +
                '}';
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getSitznummer() {
        return sitznummer;
    }

    public void setSitznummer(String sitznummer) {
        this.sitznummer = sitznummer;
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

    public boolean getAngesteckt() {
        return angesteckt;
    }

    public void setAngesteckt(boolean angesteckt) {
        this.angesteckt = angesteckt;
    }
}
