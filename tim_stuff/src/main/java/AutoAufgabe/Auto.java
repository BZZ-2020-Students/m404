package AutoAufgabe;

public class Auto {
    int id;
    double leistung, maxKraftstoffmenge, currentKraftstoff;
    String farbe, marke, kennzeichen;

    public Auto(int id, double leistung, double maxKraftstoffmenge, String farbe, String marke, String kennzeichen) {
        this.id = id;
        this.leistung = leistung;
        this.maxKraftstoffmenge = maxKraftstoffmenge;
        currentKraftstoff = maxKraftstoffmenge;
        this.farbe = farbe;
        this.marke = marke;
        this.kennzeichen = kennzeichen;
    }

    public void fahren(int howOftenOutput) {
        int counter = 0;
        System.out.println("Auto " + id + " ist jetzt am fahren!");
        while(currentKraftstoff > 0) {
            currentKraftstoff -= 0.5;
            counter++;

            if(counter == howOftenOutput) {
                System.out.println("jetziger Kraftstoff: " + currentKraftstoff);
                counter = 0;
            }
        }
        System.out.println("Auto " + id + " leer gefahren!");
    }

    public void tanken(int howOftenOutput) {
        int counter = 0;
        System.out.println("Auto " + id + " geht jetzt tanken!");
        while(currentKraftstoff < maxKraftstoffmenge) {
            currentKraftstoff += 0.5;
            counter++;

            if(counter == howOftenOutput) {
                System.out.println("jetziger Kraftstoff: " + currentKraftstoff);
                counter = 0;
            }
        }
        System.out.println("Auto " + id + " voll getankt!");
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Marke: " + marke + "\n" +
                "Kennzeichen: " + kennzeichen + "\n" +
                "Leistung: " + leistung + "\n" +
                "Kraftstoffmenge: " + currentKraftstoff + "\n" +
                "Farbe: " + farbe;
    }

    public double getLeistung() {
        return leistung;
    }

    public void setLeistung(double leistung) {
        this.leistung = leistung;
    }

    public double getMaxKraftstoffmenge() {
        return maxKraftstoffmenge;
    }

    public void setMaxKraftstoffmenge(double maxKraftstoffmenge) {
        this.maxKraftstoffmenge = maxKraftstoffmenge;
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

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}