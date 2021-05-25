package notentool;

public class Schueler {

    private Fach[] faecher;
    private String name;
    private String vorname;
    private String geburtstag;
    private String geschlecht;

    public Schueler(Fach[] faecher, String name, String vorname, String geburtstag, String geschlecht) {
        this.faecher = faecher;
        this.name = name;
        this.vorname = vorname;
        this.geburtstag = geburtstag;
        this.geschlecht = geschlecht;
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

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}
