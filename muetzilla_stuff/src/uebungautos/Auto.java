package uebungautos;

public class Auto {
    private int leistung;
    private String farbe;
    private String marke;
    private float kraftstoffmenge;
    private String kennzeichen;

    public Auto(){

    }
    public Auto(int leistung, String farbe, String marke, float kraftstoffmenge, String kennzeichen){
       this.leistung = leistung;
       this.farbe = farbe;
       this.marke = marke;
       this.kraftstoffmenge = kraftstoffmenge;
       this.kennzeichen = kennzeichen;
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
    public float getKraftstoffmenge() {
        return kraftstoffmenge;
    }
    public void setKraftstoffmenge(float kraftstoffmenge) {
        this.kraftstoffmenge = kraftstoffmenge;
    }
    public String getKennzeichen() {
        return kennzeichen;
    }
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
    public void fahren(int distanz){
        System.out.println("Tank vor der Fahrt: " + kraftstoffmenge);
        kraftstoffmenge -= distanz;
        System.out.println("Tank nach der Fahrt: " + kraftstoffmenge);
    }
    public void tanken(int liter){
        System.out.println("Tank vor dem Tanken: " + kraftstoffmenge);
        kraftstoffmenge += liter;
        System.out.println("Tank nach dem Tanken: " + kraftstoffmenge);
    }
    @Override
    public String toString(){
        return "Leistung: " + leistung + "\n" + "Farbe: " + farbe + "\n" + "Marke: " + marke + "\n" + "Kraftstoffmenge: " + kraftstoffmenge + "\n" + "Kennzeichen: " + kennzeichen + "\n" + "------------------------------------------";
    }
}
