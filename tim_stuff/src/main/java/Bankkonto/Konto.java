package Bankkonto;

public class Konto {
    int id;
    long amountMoney;
    Kunde kontoBesitzer;

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