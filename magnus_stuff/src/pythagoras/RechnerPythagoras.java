package pythagoras;

import scannen.Scann;

public class RechnerPythagoras {
    public static void main(String[] args) {
        new RechnerPythagoras().run();
    }

    public RechnerPythagoras() {
        System.out.println("Willkommen beim Pythagoras Rechner");
    }

    public void run() {
        Scann scann = new Scann();
        PhytagorasCal phytagorasCal = new PhytagorasCal();
        double result = 0;
        String antwort = null;
        String k1;
        String k2;
        String h;
        System.out.print("Katheten Eins> ");
        k1 = scann.readString();
        System.out.print("Katheten Zwei > ");
        k2 = scann.readString();
        System.out.print("Hypotenuse > ");
        h = scann.readString();

        if (k1.equals("?")) {
            antwort = "Ergebnis Kahete Eins";
            result = phytagorasCal.kCalculate(Double.valueOf(k2), Double.valueOf(h));
        } else if (k2.equals("?")) {
            antwort = "Ergebnis Kahete Zwei";
            result = phytagorasCal.kCalculate(Double.valueOf(k1), Double.valueOf(h));
        } else if (h.equals("?")) {
            antwort = "Ergebnis Hypotenuse";
            result = phytagorasCal.hCalculate(Double.valueOf(k1), Double.valueOf(k2));
        } else {
            System.out.println("Fehler");
        }

        System.out.println(antwort + " : " + result);
    }
}
