package pythagoras;

public class PhytagorasCal {
    public double kCalculate(double k, double h) {
        double u = (h*h)-(k*k);
        return Math.sqrt(u);
    }

    public double hCalculate(double k1, double k2) {
        double r = (k1*k1)+(k2*k2);
        return Math.sqrt(r);
    }
}
