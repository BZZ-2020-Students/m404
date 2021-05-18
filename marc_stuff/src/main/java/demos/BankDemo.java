package demos;

import classes.BankAccount;

public class BankDemo {
    public static void main(String[] args) {
        new BankDemo().run();
    }

    private void run() {
        BankAccount ba1 = new BankAccount(690, "CH40-6886-9648-6549-7894", "Phillip-William Jerebic");
    }
}
