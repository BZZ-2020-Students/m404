package calculations;

import scanner.InputReader;

import java.util.Locale;

public class Pythagoras {
    InputReader ir;

    public Pythagoras() {
        ir = new InputReader();
    }

    public static void main(String[] args) {
        new Pythagoras().run();
    }

    public void run() {
        System.out.print("Which side do you want to calculate (Hypotenuse => H, Other side => C) > ");
        String target = ir.readString().toUpperCase(Locale.ROOT);

        double[] nrs = new double[2];

        double result = 0;
        switch (target) {
            case "H" -> {
                for (int i = 0; i < nrs.length; i++) {
                    System.out.print("Enter the length of side " + (char) ('a' + i) + " > ");
                    nrs[i] = ir.readDouble(false);
                }

                double aSq = Math.pow(nrs[0], 2);
                double bSq = Math.pow(nrs[1], 2);
                result = Math.sqrt(aSq + bSq);
            }

            case "C" -> {
                System.out.print("Enter the length of the hypotenuse > ");
                nrs[0] = ir.readDouble(false);
                System.out.print("Enter the length of the other side > ");
                nrs[1] = ir.readDouble(false);

                double cSq = Math.pow(nrs[0], 2);
                double bSq = Math.pow(nrs[1], 2);
                result = Math.sqrt(cSq - bSq);
            }
            default -> {
                System.out.println("This is not a valid input");
                run();
            }
        }
        System.out.println("The third side has a length of: " + result);
    }
}
