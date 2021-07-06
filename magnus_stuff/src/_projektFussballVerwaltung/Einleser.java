package _projektFussballVerwaltung;

import java.time.LocalDate;
import java.util.Scanner;

public class Einleser {
    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Bitte eine Zahl eingeben!");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte eine Zahl eingeben!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public boolean readBoolean() {
        while (!scanner.hasNextBoolean()) {
            System.out.println("Bitte \"true\" oder \"false\" eingeben!");
            scanner.next();
        }
        boolean out = scanner.nextBoolean();
        scanner.nextLine();
        return out;
    }

    public char readChar() {
        char ch = scanner.nextLine().charAt(0);
        while (!Character.isLetter(ch)) {
            System.out.println("Bitte einen Buchstaben eingeben!");
            ch = scanner.nextLine().charAt(0);
        }
        return ch;
    }

    public LocalDate readDate() {
        int year;
        int month;
        int day;

        System.out.println("Bitte das Jahr angeben: ");
        year = readInt();

        System.out.println("Bitte den Monat angeben: ");
        month = readInt();

        System.out.println("Bitte den Tag angeben: ");
        day = readInt();

        return LocalDate.of(year, month, day);
    }
}
