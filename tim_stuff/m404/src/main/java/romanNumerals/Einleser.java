package romanNumerals;

import java.util.Scanner;

public class Einleser {
    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }

    public int readInt() {
        while(!scanner.hasNextInt()) {
            System.out.print("Bitte eine Ganzzahl eingeben! > ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
