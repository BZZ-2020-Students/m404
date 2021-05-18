package auto;

public class Auto {

    private int leistung;
    private String farbe;
    private String marke;
    private String modell;
    private double kraftstoffmenge;
    private String kennzeichen;

    public void fahren(){
        System.out.println("Sie fahren mit ihrem Auto 100 km, Sie haben 10 L verbraucht");
        kraftstoffmenge -= 10;
    }

    public void tanken(){
        System.out.println("Sie tanken ihr Auto, Sie haben 10 L getankt");
        kraftstoffmenge += 10;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public double getKraftstoffmenge() {
        return kraftstoffmenge;
    }

    public void setKraftstoffmenge(double kraftstoffmenge) {
        this.kraftstoffmenge = kraftstoffmenge;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
