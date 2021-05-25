package taschenrechner;

import scanner.Scan;

public class Rechner {
    Scan scanner = new Scan();
    Calculus calc = new Calculus();

    public Rechner() {
    }

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        rechner.run();
    }

    public void run() {

        double secondInput = 0;
        double result = 0;
        boolean continueCalculations = true;
        System.out.println("Herzlich Wilkommen zum Taschenrechner" +
                "\n**************************************");
        while (continueCalculations) {
            System.out.print("Geben Sie Ihre erste Zahl ein > ");
            double firstInput = scanner.scannNextDouble();
            System.out.print("Geben Sie Ihre Operationszeichen ein ( +,-,*,/,^,%,#(sqrt)) > ");
            char operationszeichen = scanner.scannAnyChar();
            if (operationszeichen == '#') {
                result = calc.sqrt(firstInput);
            } else {
                System.out.print("Geben Sie Ihre zweite Zahl ein > ");
                secondInput = scanner.scannNextDouble();
                result = operation(operationszeichen, firstInput, secondInput);
            }
            System.out.println("\nDas Resultat ist: " + result);
            System.out.print("Möchten Sie weiterrechnen (true/false) > ");
            continueCalculations = scanner.scanBoolean();
        }
    }

    private double operation(char operationszeichen, double firstInput, double secondInput) {
        if (operationszeichen == '+') {
            return calc.addition(firstInput, secondInput);
        } else if (operationszeichen == '-') {
            return calc.subtraktion(firstInput, secondInput);
        } else if (operationszeichen == '*') {
            return calc.multiplication(firstInput, secondInput);
        } else if (operationszeichen == '/') {
            while (secondInput == 0) {
                System.out.print("Division durch 0 ist nicht definiert! Bitte geben Sie erneut einen Wert ein > ");
                secondInput = scanner.scannNextDouble();
            }
            return calc.divison(firstInput, secondInput);

        } else if (operationszeichen == '^') {
            return calc.pow(firstInput, secondInput);
        } else if (operationszeichen == '%') {
            return calc.modulo(firstInput, secondInput);
        } else {
            System.out.print("Kein gültiges Operationszeichen! ");
            return ' ';
        }

    }
}
