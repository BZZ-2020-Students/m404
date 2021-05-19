package bank;

public class Konto {
    private String besitzer;
    private double kontostand;
    private int pin;

    public Konto(String besitzer, double kontostand, int pin) {
        this.besitzer = besitzer;
        this.kontostand = kontostand;
        this.pin = pin;
    }

    public void ausgeben(){
        System.out.println("Besitzer: "+ besitzer+"\nKontostand: "+ kontostand + "\nPIN: "+ pin );

    }

    public void einzahlen(double betrag){


        kontostand += betrag;
    }

    public void abheben(double betrag){
        double mindestwert = kontostand -= betrag;
        if(mindestwert <= 0){
            System.out.println("Sie können nicht soviel abheben weil Sie broke sind:)");
        }else {
            kontostand -= betrag;
        }
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
