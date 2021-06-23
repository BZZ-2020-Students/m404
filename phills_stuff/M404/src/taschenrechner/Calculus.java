package taschenrechner;

public class Calculus {

    public double plus(double zahl1, double zahl2) {
        double resultat = 0;
        resultat = zahl1 + zahl2;
        System.out.println(resultat);
        return resultat;
    }

    public double minus(double zahl1, double zahl2) {
        double resultat = 0;
        resultat = zahl1 - zahl2;
        System.out.println(resultat);
        return resultat;
    }

    public double mal(double zahl1, double zahl2) {
        double resultat = 0;
        resultat = zahl1 * zahl2;
        System.out.println(resultat);
        return resultat;
    }

    public double durch(double zahl1, double zahl2) {
        double resultat = 0;
        resultat = zahl1 / zahl2;
        if (zahl2 == 0) {
            System.out.println("Berechnung nicht möglich");
            resultat = 0;
        }
        System.out.println(resultat);

        return resultat;
    }
}
