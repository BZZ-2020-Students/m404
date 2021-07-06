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
        String doubleString = scanner.nextLine();
        return Double.parseDouble(doubleString);
    }

    public char readChar() {
        char ch = scanner.nextLine().charAt(0);
        while (!Character.isLetter(ch)) {
            System.out.println("Bitte einen der vorgegebenen Buchstaben eingeben!");
            ch = scanner.nextLine().charAt(0);
        }
        return ch;
    }
}
