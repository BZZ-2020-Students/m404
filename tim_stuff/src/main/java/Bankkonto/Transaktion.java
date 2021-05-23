package Bankkonto;

public class Transaktion {
    int id;
    Konto from; // Who sends the money
    Konto to; // Who gets the money
    Date when; // When did the transaction happen
    long moneyBefore;
    long transferredMoney; // How much money has been transferred
    long moneyAfter;
    TransaktionStatus state;
    TransaktionsTypen type;

    public Transaktion(int id, Konto from, Konto to, Date when, long moneyBefore, long transferredMoney, TransaktionStatus state, TransaktionsTypen type) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.when = when;
        this.moneyBefore = moneyBefore;
        this.transferredMoney = transferredMoney;
        this.state = state;
        this.type = type;

        moneyAfter = moneyBefore + transferredMoney;
    }

    public Transaktion(int id, Konto from, Date when, long moneyBefore, long transferredMoney, TransaktionStatus state, TransaktionsTypen type) {
        this.id = id;
        this.from = from;
        this.when = when;
        this.moneyBefore = moneyBefore;
        this.transferredMoney = transferredMoney;
        this.state = state;
        this.type = type;

        moneyAfter = moneyBefore + transferredMoney;
    }

    public String toString() {
        if (to == null) {
            return "ID: " + id + "\n" +
                    when.toString() + "\n" +
                    "Von: " + from.getKontoBesitzer().getVorname() + " " + from.getKontoBesitzer().getNachname() + "\n" +
                    "Geld vorher: " + moneyBefore + "\n" +
                    "Geschicktes Geld: " + transferredMoney + "\n" +
                    "Geld nachher: " + moneyAfter + "\n" +
                    "Status: " + state + "\n" +
                    "Typ: " + type + "\n";
        } else {
            return "ID: " + id + "\n" +
                    when.toString() + "\n" +
                    "Von: " + from.getKontoBesitzer().getVorname() + " " + from.getKontoBesitzer().getNachname() + "\n" +
                    "Zu: " + to.getKontoBesitzer().getVorname() + " " + to.getKontoBesitzer().getNachname() + "\n" +
                    "Geld vorher: " + moneyBefore + "\n" +
                    "Geschicktes Geld: " + transferredMoney + "\n" +
                    "Geld nachher: " + moneyAfter + "\n" +
                    "Status: " + state + "\n" +
                    "Typ: " + type + "\n";
        }
    }
}
