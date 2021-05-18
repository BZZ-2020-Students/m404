package Bankkonto;

import java.util.Date;

public class Transaktion {
    int id;
    Konto from; // Who sends the money
    Konto to; // Who gets the money
    Date when; // When did the transaction happen
    long amountMoney; // How much money has been transferred
    TransaktionStatus state;

    public Transaktion(int id, Konto from, Konto to, Date when, long amountMoney, TransaktionStatus state) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.when = when;
        this.amountMoney = amountMoney;
        this.state = state;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Date: " + when + "\n" +
                "From: " + from.getKontoBesitzer().getVorname() + " " + from.getKontoBesitzer().getNachname() + "\n" +
                "To: " + to.getKontoBesitzer().getVorname() + " " + to.getKontoBesitzer().getNachname() + "\n" +
                "Money Amount: " + amountMoney;
    }

    public Konto getFrom() {
        return from;
    }

    public Konto getTo() {
        return to;
    }

    public Date getWhen() {
        return when;
    }

    public long getAmountMoney() {
        return amountMoney;
    }

    public int getId() {
        return id;
    }

    public TransaktionStatus getState() {
        return state;
    }
}
