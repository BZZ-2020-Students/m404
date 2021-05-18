package Bankkonto;

import java.util.ArrayList;
import java.util.Date;

public class Konto {
    int id;
    long amountMoney;
    Kunde kontoBesitzer;
    ArrayList<Transaktion> transactionHistoryList = new ArrayList<>();

    public Konto(int id, long amountMoney, Kunde kontoBesitzer) {
        this.id = id;
        this.amountMoney = amountMoney;
        this.kontoBesitzer = kontoBesitzer;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Amount Money: " + amountMoney + "\n" +
                "Kunde:\n" + kontoBesitzer.toString();
    }

    public String[] transactionHistoryListToString() {
        String[] historyToString = new String[transactionHistoryList.size() + 1];

        historyToString[0] = "Transaction History of Bankaccount " + id;

        int counter = 1;
        for(Transaktion oneTransaction : transactionHistoryList) {
            historyToString[counter] = oneTransaction.toString();
            counter++;
        }

        return historyToString;
    }

    public boolean abheben(double amount) {
        if (amount > amountMoney) {
            return false;
        }

        amountMoney-=amount;
        return true;
    }

    public boolean zahlen(double amount) {
        if (amount > amountMoney) {
            return false;
        }

        amountMoney-=amount;
        return true;
    }

    public void einzahlen(double amount) {
        amountMoney+=amount;
    }

    private void addTransaction(int id, Konto from, Konto to, Date when, long amountMoney, TransaktionStatus state) {
        transactionHistoryList.add(new Transaktion(id, from, to, when, amountMoney, state));
    }

    public int getId() {
        return id;
    }

    public long getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(long amountMoney) {
        this.amountMoney = amountMoney;
    }

    public Kunde getKontoBesitzer() {
        return kontoBesitzer;
    }

    public void setKontoBesitzer(Kunde kontoBesitzer) {
        this.kontoBesitzer = kontoBesitzer;
    }
}