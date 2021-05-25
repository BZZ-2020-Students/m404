package scanner;

import java.util.Scanner;

public class Scan {
    private Scanner scanner;

    public Scan() {
        scanner = new Scanner(System.in);
    }

    public int scanInt() {
        int input = 0;
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Bitte einen gültigen Wert eingeben > ");
        }
        input = scanner.nextInt();
        return input;
    }

    public String scanString() {
        String input = scanner.nextLine();
        return input;
    }

    public boolean scanBoolean() {
        boolean input = scanner.nextBoolean();

        return input;
    }

    public char scannAnyChar() {
        char input = scanner.next().charAt(0);
        return input;
    }

    public char scannJustLetter() {
        char input = scanner.next().charAt(0);
        while (!Character.isLetter(input)) {
            System.out.print("Bitte einen Buchstaben eingeben >  ");
            input = scanner.next().charAt(0);

        }
        return input;
    }

    public double scannNextDouble() {
        double input = 0;
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Bitte einen gültigen Wert eingeben > ");
        }
        input = scanner.nextDouble();
        return input;
    }

    public float scannNextFloat() {
        float input = 0;
        while (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.print("Bitte einen gültigen Wert eingeben > ");
        }
        input = scanner.nextFloat();
        return input;
    }
}
