package autoGarage;

public class Auto<maxTank> {

    private int leistung;
    private String farbe;
    private String marke;
    private String kennzeichen;
    private double kraftstoffmenge;
    private double maxTank;

    public void fahren(){
        kraftstoffmenge -= 10;
    }

    public void tanken(){
        if(kraftstoffmenge + 5 < maxTank ){
            kraftstoffmenge += 5;
        }else {
            double newTank = maxTank - kraftstoffmenge;
            kraftstoffmenge += newTank;
        }
    }

    public Auto(int leistung, String farbe, String marke, String kennzeichen, double kraftstoffmenge, double maxTank) {
        this.leistung = leistung;
        this.farbe = farbe;
        this.marke = marke;
        this.kraftstoffmenge = kraftstoffmenge;
        this.kennzeichen = kennzeichen;
        this.maxTank = maxTank;
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

    public double getMaxTank() {
        return maxTank;
    }

    public void setMaxTank(double maxTank) {
        this.maxTank = maxTank;
    }

    @Override
    public String toString(){
        return "Marke: " + marke + " Leistung: " + leistung + " Farbe: " + farbe + " Kennzeichen: " + kennzeichen + " Kraftstoffmenge " + kraftstoffmenge;
    }

}
