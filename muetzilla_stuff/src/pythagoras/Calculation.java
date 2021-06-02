package pythagoras;

public class Calculation {

    public double calculateU(String iString, String rString) {
        double iDouble = Double.parseDouble(iString);
        double rDouble = Double.parseDouble(rString);
        return iDouble * rDouble;
    }

    public double calculateR(String uString, String iString) {
        double uDouble = Double.parseDouble(uString);
        double iDouble = Double.parseDouble(iString);
        return uDouble / iDouble;
    }

    public double calculateI(String uString, String rString) {
        double uDouble = Double.parseDouble(uString);
        double rDouble = Double.parseDouble(rString);
        return uDouble / rDouble;
    }
}
