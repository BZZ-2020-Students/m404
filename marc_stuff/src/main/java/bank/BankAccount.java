package bank;

import java.util.ArrayList;

public class BankAccount {
    private long money;
    private String iban;
    private String ownerName;
    private ArrayList<String> history = new ArrayList<>();

    public void deposit(long money) {
        System.out.println(money / 100d + "CHF were deposited to " + ownerName);
        history.add("+" + money);
        this.money += money;
    }

    public void withdraw(long money) {
        System.out.println(money / 100d + "CHF were withdrawn from " + ownerName);
        history.add("-" + money);
        this.money += money;
    }

    public BankAccount(long money, String iban, String ownerName) {
        this.money = money;
        this.iban = iban;
        this.ownerName = ownerName;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "money=" + money +
                ", iban='" + iban + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", history=" + history +
                '}';
    }
}
