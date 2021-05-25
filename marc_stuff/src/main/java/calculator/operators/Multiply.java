package calculator.operators;

public class Multiply implements Operator{
    @Override
    public double calculate(double start, double... nrs) {
        for (double d : nrs) start *= d;
        return start;
    }

    @Override
    public char getOperator() {
        return '*';
    }
}
