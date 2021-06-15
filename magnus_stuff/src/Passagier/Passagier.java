package Passagier;

import java.time.LocalDate;

public class Passagier {
    private String sitznummer;
    private String name;
    private String vorname;
    private LocalDate geburtsdatum;

    public Passagier(){}

    public Passagier(String sitznummer, String name, String vorname, LocalDate geburtsdatum) {
        this.sitznummer = sitznummer;
        this.name = name;
        this.vorname = vorname;
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

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "sitznummer=" + sitznummer +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
}
