package calculator.operators;

public interface Operator {
    double calculate(double start, double ... nrs);
    char getOperator();
}
