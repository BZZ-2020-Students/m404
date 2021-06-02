package stromRechner;

public class StromCal {
    public double uCalculate(double r, double i){
        double u = r * i;
        return u;
    }
    public double rCalculate(double u, double i){
        double r = u / i;
        return r;
    }
    public double iCalculate(double u, double r){
        double i = u / r;
        return i;
    }
}
