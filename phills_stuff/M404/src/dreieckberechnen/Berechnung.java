package dreieckberechnen;

public class Berechnung {
    public void berechnena(String Sb, String Sc) {
        double resultat;
        double zresultat;
        double b = Double.parseDouble(Sb);
        double c = Double.parseDouble(Sc);

        b = b * b;
        c = c * c;
        zresultat = c - b;
        resultat = Math.sqrt(zresultat);
        System.out.println("Seite a ist " + resultat + " lang.");


    }

    public void berechnenb(String Sa, String Sc) {
        double resultat;
        double zresultat;
        double a = Double.parseDouble(Sa);
        double c = Double.parseDouble(Sc);

        a = a * a;
        c = c * c;
        zresultat = c - a;
        resultat = Math.sqrt(zresultat);
        System.out.println("Seite b ist " + resultat + " lang.");
    }

    public void berechnenc(String Sa, String Sb) {
        double resultat;
        double zresultat;
        double a = Double.parseDouble(Sa);
        double b = Double.parseDouble(Sb);
        a = a * a;
        b = b * b;
        zresultat = a + b;
        resultat = Math.sqrt(zresultat);
        System.out.println("Seite c ist " + resultat + " lang.");

    }
}
