package PythagorasRechner;

import static java.lang.Math.sqrt;

public class Rechner {

    Einleser scanner = new Einleser();

    public Rechner() {
        for(Seiten seite : Seiten.values()) {
            System.out.print(seite + " > ");
            seite.setValue(scanner.readString().replaceAll(" ",""));
        }

        Seiten seiten = Seiten.values()[0];
        for(int i = 0; i < Seiten.values().length; i++) {
            if(seiten.getValue() == null) {
                break;
            } else {
                seiten = seiten.next();
            }
        }

        // System.out.println("Zu findende Einheit : " + einheit);
        System.out.println(seiten + " = " + berechnen(seiten));
    }

    public double berechnen(Seiten seiten) {
        return switch(seiten) {
            case SEITE_c -> sqrt(Math.pow(Seiten.SEITE_a.getValue(),2) + Math.pow(Seiten.SEITE_b.getValue(),2));
            case SEITE_a -> sqrt(Math.pow(Seiten.SEITE_c.getValue(),2) - Math.pow(Seiten.SEITE_b.getValue(),2));
            case SEITE_b -> sqrt(Math.pow(Seiten.SEITE_c.getValue(),2) - Math.pow(Seiten.SEITE_a.getValue(),2));
        };
    }

    public static void main(String[] args) {
        new Rechner();
    }
}