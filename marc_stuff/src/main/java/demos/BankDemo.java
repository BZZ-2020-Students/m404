package demos;

import classes.BankAccount;

public class BankDemo {
    public static void main(String[] args) {
        new BankDemo().run();
    }

    private void run() {
        BankAccount ba1 = new BankAccount(690 * 100, "CH40-6886-9648-6549-7894", "Phillip-William Jerebic");
        BankAccount ba2 = new BankAccount(4271 * 100, "CH40-7536-1234-9387-4689", "Tim-Jan Irmler");
        BankAccount ba3 = new BankAccount(1658 * 100, "CH40-2341-1292-5741-0919", "Alyssa Mei-Yun Heimlicher");

        ba1.deposit(970 * 100);
        ba2.deposit(902 * 100);
        ba3.deposit(970 * 100);

        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);

        ba1.withdraw(56 * 100);
        ba2.withdraw(10 * 100);
        ba3.withdraw(35 * 100);

        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println(ba3);
    }
}
