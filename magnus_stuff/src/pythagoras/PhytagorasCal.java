package pythagoras;

public class PhytagorasCal {
    public double kCalculate(double k, double h) {
        return Math.sqrt(Math.pow(h, 2)-Math.pow(k, 2));
    }

    public double hCalculate(double k1, double k2) {
        return Math.sqrt(Math.pow(k1, 2)+Math.pow(k2, 2));
    }
}
