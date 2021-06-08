package Taschenrechner;

import java.util.Scanner;

public class Einleser {
    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public boolean readBoolean() {
        while(!scanner.hasNextBoolean()) {
            System.out.println("Bitte \"true\" oder \"false\" eingeben!");
            scanner.next();
        }
        boolean out = scanner.nextBoolean();
        scanner.nextLine();
        return out;
    }
}
