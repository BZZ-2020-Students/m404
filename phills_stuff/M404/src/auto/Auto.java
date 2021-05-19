package auto;

public class Auto {

    private int leistung;
    private String farbe;
    private String marke;
    private String modell;
    private double kraftstoffmenge;
    private String kennzeichen;

    private double verbrauch100km;

    public Auto(int leistung, String farbe, String marke, String modell, double kraftstoffmenge, String kennzeichen, double verbrauch100km) {
        this.leistung = leistung;
        this.farbe = farbe;
        this.marke = marke;
        this.modell = modell;
        this.kraftstoffmenge = kraftstoffmenge;
        this.kennzeichen = kennzeichen;
        this.verbrauch100km = verbrauch100km;
    }

    public void ausgeben(){
        System.out.println("Marke: "+ marke+"\nModell: "+ modell + "\nLeistung: "+ leistung + "\nVerbrauch auf 100km: "+ verbrauch100km +"\nFarbe: "+farbe+ "\nKraftstoffmenge: " + kraftstoffmenge + "\nKennzeichen: " + kennzeichen);
    }

    public void fahren(){


        double restkraftstoffmenge = kraftstoffmenge -= verbrauch100km;
        if(restkraftstoffmenge <= 0){
            System.out.println("Ihr Fahrzeug hat einen Leeren Tank Sie können nicht weiterfahren");

        }else {
            System.out.println("Sie fahren mit ihrem " + modell +" 100 km, Sie haben 10 L verbraucht");
            kraftstoffmenge -= verbrauch100km;
        }
    }

    public void tanken(){
        System.out.println("Sie betanken ihren " + modell + " mit 10 l");
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
    public double getVerbrauch100km() {
        return verbrauch100km;
    }

    public void setVerbrauch100km(double verbrauch100km) {
        this.verbrauch100km = verbrauch100km;
    }
}
