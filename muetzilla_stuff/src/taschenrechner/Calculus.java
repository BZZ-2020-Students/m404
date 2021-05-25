package taschenrechner;

public class Calculus {
    public double addition(double summand1, double summand2) {
        return summand1 + summand2;
    }

    public double subtraktion(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double multiplication(double multiplikator, double multiplikand) {
        return multiplikator * multiplikand;
    }

    public double divison(double dividen, double divisor) {
        try {
            return dividen / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 ist nicht definiert!");
            return 0;
        }
    }

    public double sqrt(double zahl) {
        return Math.sqrt(zahl);
    }

    public double pow(double basis, double exponent) {
        return Math.pow(basis, exponent);
    }
}
