package Bankkonto;

public class Konto {
    int id;
    double amountMoney;
    Kunde kontoBesitzer;

    public Konto(int id, double amountMoney, Kunde kontoBesitzer) {
        this.id = id;
        this.amountMoney = amountMoney;
        this.kontoBesitzer = kontoBesitzer;
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

    public int getId() {
        return id;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public Kunde getKontoBesitzer() {
        return kontoBesitzer;
    }

    public void setKontoBesitzer(Kunde kontoBesitzer) {
        this.kontoBesitzer = kontoBesitzer;
    }
}