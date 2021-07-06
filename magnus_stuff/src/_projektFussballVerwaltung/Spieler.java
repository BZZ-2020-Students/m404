package _projektFussballVerwaltung;

public class Spieler {
    private String name;
    private String vorname;
    private int spielernummer;

    public Spieler(){
    }

    public Spieler(String name, String vorname, int spielernummer) {
        this.name = name;
        this.vorname = vorname;
        this.spielernummer = spielernummer;
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

    public int getSpielernummer() {
        return spielernummer;
    }

    public void setSpielernummer(int spielernummer) {
        this.spielernummer = spielernummer;
    }
}
