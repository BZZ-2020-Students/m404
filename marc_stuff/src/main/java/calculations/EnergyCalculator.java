package calculations;

import scanner.InputReader;

import java.util.Locale;

public class EnergyCalculator {
    InputReader ir;
    Unit target;

    public EnergyCalculator() {
        ir = new InputReader();
    }

    public static void main(String[] args) {
        new EnergyCalculator().run();
    }

    public void run() {
        System.out.print("What do you want to calculate? (Voltage => V, Current => C, Resistance => R) > ");
        String t = ir.readString();

        double[] values = new double[] {1, 1};

        switch (t.toLowerCase(Locale.ROOT)) {
            case "v" -> target = Unit.VOLTAGE;
            case "c" -> target = Unit.CURRENT;
            case "r" -> target = Unit.RESISTANCE;
            default -> run();
        }


        Unit input = target.next();
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter the " + input.toString().toLowerCase(Locale.ROOT) + " of your circuit > ");
            values[i] = ir.readDouble(false);
            input = input.next();
        }

        double result = 0;

        switch (target) {
            case CURRENT -> result = values[0] * values[1];
            case RESISTANCE -> result = values[0] / values[1];
            case VOLTAGE -> result = values[1] / values[0];
        }

        System.out.println("The " + target.toString().toLowerCase(Locale.ROOT) + " is -> " + result);
    }
}
