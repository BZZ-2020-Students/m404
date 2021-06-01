package pythagoras;

public class Calculation {

    public double seiteA(String seiteBString, String seiteCString) {
        double seiteBDouble = Double.parseDouble(seiteBString);
        double seiteCDouble = Double.parseDouble(seiteCString);
        return Math.sqrt((Math.pow(seiteCDouble, 2) - Math.pow(seiteBDouble, 2)));
    }

    public double seiteB(String seiteAString, String seiteCString) {
        double seiteADouble = Double.parseDouble(seiteAString);
        double seiteCDouble = Double.parseDouble(seiteCString);
        return Math.sqrt((Math.pow(seiteCDouble, 2) - Math.pow(seiteADouble, 2)));
    }

    public double seiteC(String seiteAString, String seiteBString) {
        double seiteBDouble = Double.parseDouble(seiteBString);
        double seiteADouble = Double.parseDouble(seiteAString);
        return Math.sqrt((Math.pow(seiteADouble, 2) + Math.pow(seiteBDouble, 2)));
    }
}
