package ampereberechnen;

public class Berechnung {
    public void berechneni(String Su, String Sr) {
        double u = Double.parseDouble(Su);
        double r = Double.parseDouble(Sr);
        double resultat = u / r;
        System.out.println("I = " + resultat);
    }

    public void berechnenu(String Si, String Sr) {
        double i = Double.parseDouble(Si);
        double r = Double.parseDouble(Sr);
        double resultat = r * i;
        System.out.println("U = " + resultat);
    }

    public void berechnenr(String Su, String Si) {
        double u = Double.parseDouble(Su);
        double i = Double.parseDouble(Si);
        double resultat = u / i;
        System.out.println("R = " + resultat);
    }
}
