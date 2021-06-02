package PythagorasRechner;

import java.util.Scanner;

public class Einleser {
    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }
}
