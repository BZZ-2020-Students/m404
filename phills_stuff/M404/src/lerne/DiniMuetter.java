package lerne;

public class DiniMuetter {
    private double schwanzlaenge;
    private String vorname;
    private String nachname;
    private String addresse;
    private double kosten;
    private DiniMuetter[] diniMuetters = new DiniMuetter[5];

    public DiniMuetter(double schwanzlaenge, String vorname, String nachname, String addresse, double kosten) {
        this.schwanzlaenge = schwanzlaenge;
        this.vorname = vorname;
        this.nachname = nachname;
        this.addresse = addresse;
        this.kosten = kosten;
    }

    public DiniMuetter(){

    }

    public DiniMuetter[] erfasseDiniMuetter(){
       schwanzlaenge = 2;
       vorname = "Hanspeter";
       nachname = "Gasbichler";
       addresse = "DiniMuetterstrass 69";
       kosten = 420.69;
       diniMuetters[0] = this;
       return diniMuetters;
    }

    public double getSchwanzlaenge() {
        return schwanzlaenge;
    }

    public void setSchwanzlaenge(double schwanzlaenge) {
        this.schwanzlaenge = schwanzlaenge;
    }

    public String getvorname() {
        return vorname;
    }

    public void setvorname(String vorname) {
        this.vorname = vorname;
    }

    public String getnachname() {
        return nachname;
    }

    public void setnachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }
}
