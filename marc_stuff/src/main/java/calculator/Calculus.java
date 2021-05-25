package calculator;

import calculator.operators.*;

public class Calculus {
    boolean showDebug;

    Operator[] ops = new Operator[4];

    public Calculus() {
        this(false);
    }

    public Calculus(boolean showDebug) {
        this.showDebug = showDebug;
        ops[0] = new Add();
        ops[1] = new Subtract();
        ops[2] = new Multiply();
        ops[3] = new Divide();
    }

    public double calculate(String calc) {
        Operator current = null;
        String[] nrs = new String[]{"", ""};
        int index = 0;
        for (char c : calc.toCharArray()) {
            if (c >= 48 && c <= 57 || c == '.') {
                nrs[index] += c;
            }

            for (Operator o : ops) {
                if (current != null && c == o.getOperator()) {
                    index = 0;
                    System.out.println("" + nrs[0] + current.getOperator() + nrs[1]);
                    nrs[0] ="" + current.calculate(Double.parseDouble(nrs[0]), Double.parseDouble(nrs[1]));
                    nrs[1] = "";
                }

                if (c == o.getOperator()) {
                    current = o;
                    printDebug("op changed to -> " + o.getOperator());
                    index++;
                    break;
                }
            }
        }
        assert current != null;
        return current.calculate(Double.parseDouble(nrs[0]), Double.parseDouble(nrs[1]));
    }

    private void printDebug(String info) {
        if (showDebug) System.out.println(info);
    }
}
