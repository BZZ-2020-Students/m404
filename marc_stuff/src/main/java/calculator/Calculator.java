package calculator;

import scanner.InputReader;

public class Calculator {
    InputReader ir = new InputReader();

    public static void main(String[] args) {
        new Calculator().run();
    }


    private void run() {
        boolean next = false;
        String regex = ",";
        double res;
        double first = 0;
        double[] numbers;
        boolean continueCalc = false;

        do {
            if (!continueCalc) {
                System.out.print("Enter your first number ...................................................... -> ");
                first = ir.readDouble();
            }

            System.out.print("Enter your second number (multiple numbers separated with a '" + regex + "') -> ");
            numbers = ir.readDoubleArray(",");
            System.out.print("Enter the operator you want to use ........................................... -> ");
            char operator = ir.readChar();
            while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.print("Please enter a valid operator (+, -, *, /) ............................... -> ");
                operator = ir.readChar();
            }

            switch (operator) {
                case '+' -> res = Calculus.add(first, numbers);
                case '-' -> res = Calculus.subtract(first, numbers);
                case '*' -> res = Calculus.multiply(first, numbers);
                case '/' -> res = Calculus.divide(first, numbers);
                default -> res = 0;
            }

            System.out.println("Your result is -> " + res);

            System.out.print("A => Continue with result, C => New Calculation, E => Exit -> ");
            char c = ir.readChar();
            switch (c) {
                case 'A' -> {
                    first = res;
                    continueCalc = true;
                    next = true;
                }
                case 'C' -> {
                    first = 0;
                    next = true;
                    continueCalc = false;
                }
                case 'E' -> next = false;
            }
        } while (next);
    }
}
