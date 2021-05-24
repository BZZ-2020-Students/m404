package bankkonto;

import java.util.ArrayList;

public class Konto {
    String iban;
    double vermoegen;
    String besVorname;
    String besNachane;
    String besAnrede;
    boolean kontoUeberzogen;
    String waehrung;
    ArrayList<Double> history = new ArrayList<>();

    public Konto() {

    }

    public Konto(String iban, double vermogegen, String besVorname, String besNachane, String besAnrede, boolean kontoUeberzogen, String waehrung) {
        this.iban = iban;
        this.vermoegen = vermogegen;
        this.besVorname = besVorname;
        this.besNachane = besNachane;
        this.besAnrede = besAnrede;
        this.kontoUeberzogen = kontoUeberzogen;
        this.waehrung = waehrung;
        updateHistory(vermoegen);
    }

    public void updateHistory(double vermoegen) {
        history.add(vermoegen);
    }

    public String showHistory() {
        String historyAsString = "";
        for (int i = 0; i < history.size(); i++) {
            historyAsString += history.get(i);
            historyAsString += waehrung;
            if (i != history.size() - 1) {
                historyAsString += " - ";
            }
        }
        return historyAsString;
    }

    @Override
    public String toString() {
        return "------------------------------------" +
                "\nBankkonto von: " +
                "\n" + besAnrede + " " + besVorname + " " + besNachane +
                " mit der IBAN: " + iban +
                " ist " + uebertogenToString() +
                " und hat momentan ein Vermögen von: " + vermoegen + waehrung + "\n" +
                "Der Verlauf des Kontos ist: \n" + showHistory() + "\n------------------------------------\n";
    }

    public String getOwner() {
        return besAnrede + " " + besVorname + " " + besNachane;
    }

    public String uebertogenToString() {
        if (kontoUeberzogen) {
            return "überzogen";
        } else {
            return "nicht überzogen";
        }
    }

    public String einzahlung(double einzahlungsBetrag) {
        vermoegen += einzahlungsBetrag;
        updateHistory(vermoegen);
        return "\nAufgrund einer Einzahlung von " + einzahlungsBetrag + waehrung + " beträgt das neue Vermögen des Kontos " + iban + " nun: " + vermoegen + waehrung + "\nDer Verlauf des Kontos ist: " + showHistory();
    }

    public String zahlung(double zahlungsBetrag) {
        vermoegen -= zahlungsBetrag;
        if (vermoegen < 0) {
            kontoUeberzogen = true;
        }
        updateHistory(vermoegen);
        return "\nAufgrund einer eingegangenen Zahlung von " + zahlungsBetrag + waehrung + " beträgt das neue Vermögen des Kontos " + iban + " nun: " + vermoegen + waehrung
                + "\nDer Verlauf des Kontos ist: " + showHistory();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getVermoegen() {
        return vermoegen;
    }

    public void setVermoegen(double vermoegen) {
        this.vermoegen = vermoegen;
    }

    public String getBesVorname() {
        return besVorname;
    }

    public void setBesVorname(String besVorname) {
        this.besVorname = besVorname;
    }

    public String getBesNachane() {
        return besNachane;
    }

    public void setBesNachane(String besNachane) {
        this.besNachane = besNachane;
    }

    public String getBesAnrede() {
        return besAnrede;
    }

    public void setBesAnrede(String besAnrede) {
        this.besAnrede = besAnrede;
    }

    public boolean isKontoUeberzogen() {
        return kontoUeberzogen;
    }

    public void setKontoUeberzogen(boolean kontoUeberzogen) {
        this.kontoUeberzogen = kontoUeberzogen;
    }
}
