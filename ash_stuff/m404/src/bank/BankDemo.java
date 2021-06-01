package bank;

public class BankDemo {
    public static void main(String[] args) {
        new BankDemo().run();

    }

    public void run(){
        BankAcc ba = new BankAcc(36446, "Alyssa", "Heimlicher", "CH93 0076 2011 6238 5295 7");
        BankAcc ba2 = new BankAcc(23423, "Marc", "Fuchs", "CH020 8401 0000 5113 8778");
        BankAcc ba3 = new BankAcc(2342, "Tim", "Irmler", "CH93 0588 1020 6247 5100");

        ba.depo(23464);
        ba2.depo(3453);
        ba3.depo(984);

        ba.withdraw(5345);

        System.out.println(ba.toString());
        System.out.println(ba2.toString());
        System.out.println(ba3.toString());

    }
}
