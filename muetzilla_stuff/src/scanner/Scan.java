package scanner;

import java.util.Scanner;

public class Scan {
    private Scanner scanner;

    public Scan() {
        scanner = new Scanner(System.in);
    }

    public int scanInt() {
        int input = scanner.nextInt();
        while (scanner.hasNextInt()) {
            System.out.print("Bitte geben Sie einen gültigen Wert ein > ");
            input = scanner.nextInt();
        }
        //Cache leeren
        scanner.nextLine();
        return input;
    }

    public String scanString() {
        String input = scanner.nextLine();
        return input;
    }

    public boolean scanBoolean() {
        boolean input = scanner.nextBoolean();
        //Cache leeren
        scanner.nextLine();
        return input;
    }

    public char scannAnyChar() {
        char input = scanner.next().charAt(0);
        //Cache leeren
        scanner.nextLine();
        return input;
    }

    public char scannJustLetter() {
        char input = scanner.next().charAt(0);
        //Cache leeren
        scanner.nextLine();
        while (!Character.isLetter(input)) {
            System.out.print("Bitte einen Buchstaben eingeben >  ");
            input = scanner.next().charAt(0);
            //Cache leeren
            scanner.nextLine();
        }
        return input;
    }

    public double scannNextDouble() {
        double input = scanner.nextDouble();
        while (scanner.hasNextDouble()) {
            System.out.print("Bitte geben Sie einen gültigen Wert ein > ");
            input = scanner.nextDouble();
        }
        //Cache leeren
        scanner.nextLine();
        return input;
    }

    public float scannNextFloat() {
        float input = scanner.nextFloat();
        while (scanner.hasNextFloat()) {
            System.out.print("Bitte geben Sie einen gültigen Wert ein > ");
            input = scanner.nextFloat();
        }
        //Cache leeren
        scanner.nextLine();
        return input;
    }
}
