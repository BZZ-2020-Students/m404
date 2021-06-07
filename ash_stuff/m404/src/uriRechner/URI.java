package uriRechner;

public class URI {


    public double calcU(String rStr, String iStr){
        double r = Double.valueOf(rStr);
        double i = Double.valueOf(iStr);
        return r * i;
    }

    public double calcI(String uStr, String rStr){
        double u = Double.valueOf(uStr);
        double r = Double.valueOf(rStr);
        return u / r;
    }

    public double calcR(String uStr, String iStr){
        double u = Double.valueOf(uStr);
        double i = Double.valueOf(iStr);
        return u / i;
    }

    public URI(){}

}
