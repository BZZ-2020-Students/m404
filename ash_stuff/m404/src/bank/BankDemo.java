package bank;

import java.util.ArrayList;

public class BankDemo {
    public static void main(String[] args) {
        new BankDemo().run();

    }

    public void run(){
        ArrayList bankaccs = new ArrayList<String>();

        BankAcc ba1 = new BankAcc(36446, "Alyssa", "Heimlicher", "CH93 0076 2011 6238 5295 7");
        BankAcc ba2 = new BankAcc(23423, "Marc", "Fuchs", "CH020 8401 0000 5113 8778");
        BankAcc ba3 = new BankAcc(2342, "Tim", "Irmler", "CH93 0588 1020 6247 5100");


        ba1.depo(23464);
        ba2.depo(3453);
        ba3.depo(984);

        ba1.withdraw(5345);

        bankaccs.add(ba1);
        bankaccs.add(ba2);
        bankaccs.add(ba3);
        System.out.println();

        for (int i = 0; i < bankaccs.size(); i++) {
            System.out.println(bankaccs.get(i).toString());
        }




    }
}
