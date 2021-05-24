package Bankkonto;

import java.util.ArrayList;

public class Konto {
    int id;
    int transactionId = 0;
    long moneyBeforeSimulation;
    long amountMoney;
    boolean hasBeenSimulated = false;
    Kunde kontoBesitzer;
    ArrayList<Transaktion> transactionHistoryList = new ArrayList<>();

    public Konto(int id, long amountMoney, Kunde kontoBesitzer) {
        this.id = id;
        this.amountMoney = amountMoney;
        this.kontoBesitzer = kontoBesitzer;
        moneyBeforeSimulation = amountMoney;
    }

    public String toString() {
        if(hasBeenSimulated) {
            return "Konto ID: " + id + "\n" +
                    "Amount Money before Sim: " + moneyBeforeSimulation + "\n" +
                    "Amount Money after Sim: " + amountMoney + "\n" +
                    kontoBesitzer.toString();
        } else {
            return "Konto ID: " + id + "\n" +
                    "Amount Money" + amountMoney + "\n" +
                    kontoBesitzer.toString();
        }
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

    public void printTransactionHistory() {
        System.out.println("Transaction History of Bankaccount " + id);
        for(Transaktion oneTransaction : transactionHistoryList) {
            System.out.println(oneTransaction.toString());
        }
    }

    public void addTransaction(int id, Konto from, Konto to, Date when, long moneyBefore, long transferredMoney, TransaktionStatus state, TransaktionsTypen type) {
        transactionHistoryList.add(new Transaktion(id, from, to, when, moneyBefore, transferredMoney, state, type));
    }

    public void addTransaction(int id, Konto from, Date when, long moneyBefore, long transferredMoney, TransaktionStatus state, TransaktionsTypen type) {
        transactionHistoryList.add(new Transaktion(id, from, when, moneyBefore, transferredMoney, state, type));
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