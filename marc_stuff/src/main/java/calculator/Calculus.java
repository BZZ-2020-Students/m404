package calculator;

public class Calculus {
    public static double add(double summand, double ... summands) {
        for (double d : summands)
            summand += d;
        return summand;
    }

    public static double subtract(double minuend, double ... subtrahends) {
        for (double d : subtrahends)
            minuend -= d;
        return  minuend;
    }

    public static double divide(double dividend, double ... divisors) {
        for (double d : divisors)
            dividend /= d;

        return dividend;
    }

    public static double multiply(double factor, double ... factors) {
        for (double d : factors)
            factor *= d;
        return factor;
    }
}
