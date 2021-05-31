package Taschenrechner;

import Taschenrechner.Math.AbstractMath;

import java.util.Arrays;

public class NumberPair {
    private String[] numbers = {"",""};
    private AbstractMath abstractMath = null;
    private char operator;

    public NumberPair(String[] numbers, AbstractMath abstractMath) {
        this.numbers = numbers;
        this.abstractMath = abstractMath;
    }

    public NumberPair() {
    }

    public String[] getNumbers() {
        return numbers;
    }

    public double getNumber(int i) {
        return Double.parseDouble(numbers[i]);
    }

    public String getNumberString(int i) {
        return numbers[i];
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public void setNumber(int i, String s) {
        this.numbers[i] = s;
    }

    public void addToNumber(int i, String s) {
        this.numbers[i] += s;
    }

    public void addToNumber(int i, char c) {
        this.numbers[i] += c;
    }

    public AbstractMath getAbstractMath() {
        return abstractMath;
    }

    public void setAbstractMath(AbstractMath abstractMath) {
        this.abstractMath = abstractMath;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "NumberPair{" +
                "numbers=" + Arrays.toString(numbers) +
                ", abstractMath="+"'"+operator+"'"+"}";
    }
}
