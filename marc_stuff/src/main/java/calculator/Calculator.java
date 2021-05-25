package calculator;

import scanner.InputReader;

public class Calculator {
    InputReader ir = new InputReader();
    Calculus cl;

    public static void main(String[] args) {
        new Calculator().run();
    }

    private void run() {
        System.out.println("+------------+");
        System.out.println("|Can contain:|");
        System.out.println("| - '+'      |");
        System.out.println("| - '-'      |");
        System.out.println("| - '*'      |");
        System.out.println("| - '/'      |");
        System.out.println("| - '.'      |");
        System.out.println("+------------+");
        System.out.print("Enable debug information? (true, false) -> ");
        boolean debug = ir.readBool();
        System.out.print("Enter a math problem according to the rules above -> ");
        String math = ir.readString();
        cl = new Calculus(debug);

        double result = cl.calculate(math);
        System.out.println(result);
    }
}
