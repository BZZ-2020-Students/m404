package notenverwaltung;


import java.util.Scanner;

public class Schule {
    static Scanner scanner;

    public Schule() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Schule schule = new Schule();
        schule.run();
        scanner.close();
    }

    public void run() {
    }
}
