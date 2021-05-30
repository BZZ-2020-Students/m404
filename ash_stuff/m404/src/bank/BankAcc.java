package bank;

import java.util.ArrayList;

public class BankAcc {
    private double money;
    private String firstName;
    private String lastName;
    private String iban;
    private ArrayList<String> history = new ArrayList<>();


    public double withdraw(double amount){
        money += amount;
        history.add("-" + amount + "chf");
        System.out.println(amount + " was withdrawn from " + firstName);
        return money;
    }

    public double depo(double amount){
        money -= amount;
        history.add("+" + amount + "chf");
        System.out.println(amount + " was deposited to " + firstName);
        return money;
    }

    public BankAcc(double money, String firstName, String lastName, String iban) {
        this.money = money;
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "BankAcc{" +
                "money = " + money + "CHF" +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", iban = '" + iban + '\'' +
                ", history = " + history +
                '}';
    }
}
