package pythagorasCalc;

public class Pythagoras {


    public double sideA(String bStr, String cStr){
        double b = Double.valueOf(bStr);
        double c = Double.valueOf(cStr);
        return Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
    }

    public double sideB(String aStr, String cStr){
        double a = Double.valueOf(aStr);
        double c = Double.valueOf(cStr);
        return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    }

    public double sideC(String aStr, String bStr){
        double a = Double.valueOf(aStr);
        double b = Double.valueOf(bStr);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Pythagoras(){}

}
