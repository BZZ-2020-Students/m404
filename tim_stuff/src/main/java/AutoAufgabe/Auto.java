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

    public void fahren() {
        // Der durchschnittliche Kraftstoffverbrauch liegt bei 7.8 Liter Benzin pro 100 Kilometer (src: https://de.statista.com/statistik/daten/studie/484054/umfrage/durchschnittsverbrauch-pkw-in-privaten-haushalten-in-deutschland/#:~:text=Der%20durchschnittliche%20Kraftstoffverbrauch%20von%20Personenkraftwagen,Kraftstoff%20f%C3%BCr%20die%20gleiche%20Strecke.
        // Bei der Berechnung gehen wir von diesem Wert aus
        System.out.println("Auto " + id + " ist jetzt am fahren!");
        double gefahreneKilometer = currentKraftstoff / 7.8 * 100;
        currentKraftstoff = 0;
        System.out.println("Auto " + id + " fuhr " + gefahreneKilometer + " Kilometer!");
    }

    public void tanken() {
        System.out.println("Auto " + id + " geht jetzt tanken!");
        double zuTankendeMenge = maxKraftstoffmenge - currentKraftstoff;
        System.out.println("Auto " + id + " hat " + zuTankendeMenge + " Liter Kraftstoff getankt und ist wieder voll");
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