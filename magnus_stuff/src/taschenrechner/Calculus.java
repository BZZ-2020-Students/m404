package taschenrechner;

public class Calculus {
    public double calculate(double wert1, String zeichen, double wert2) {
        double ergebnis = 0;

        switch (zeichen){
            case "+":
                ergebnis = wert1 + wert2;
                break;
            case "-":
                ergebnis = wert1 - wert2;
                break;
            case "*":
                ergebnis = wert1 * wert2;
                break;
            case "/":
                ergebnis = wert1 / wert2;
                break;
        }

        return ergebnis;
    }
}
