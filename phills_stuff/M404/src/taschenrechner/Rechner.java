package taschenrechner;


import java.util.Scanner;

public class Rechner {

    static Scanner scanner;
    String operator = "";
    double zahl1;
    double zahl2;
    Calculus calc;
    Einleser einlesen;

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        scanner = new Scanner(System.in);

        rechner.run();
    }

    public void run() {

        calc = new Calculus();
        einlesen = new Einleser();

        System.out.println("Willkommen beim Rechner");
        System.out.println("Wie möchten Sie Rechnen? [+|-|*|/]");

        operator = einlesen.readString();
        boolean falscheeingabe = false;
        do {
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {

                falscheeingabe = false;
            } else {
                System.out.println("Geben Sie einen der oben gewählten Operatoren: ");
                operator = einlesen.readString();
                falscheeingabe = true;
            }
        } while (falscheeingabe);

        System.out.println("Geben Sie die erste Zahl ein: ");
        zahl1 = einlesen.readDouble();

        System.out.println("Geben Sie die zweite Zahl ein: ");
        zahl2 = einlesen.readDouble();

        switch (operator) {
            case "+":
                calc.plus(zahl1, zahl2);
                break;
            case "-":
                calc.minus(zahl1, zahl2);
                break;
            case "*":
                calc.mal(zahl1, zahl2);
                break;
            case "/":
                calc.durch(zahl1, zahl2);
                break;
        }

    }
}
