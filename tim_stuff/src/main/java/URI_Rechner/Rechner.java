package URI_Rechner;

public class Rechner {

    Einleser scanner = new Einleser();

    public Rechner() {
        System.out.print("U (VOLT) > ");
        Einheit.VOLT.setValue(scanner.readString().replaceAll(" ",""));

        System.out.print("R (OHM) > ");
        Einheit.OHM.setValue(scanner.readString().replaceAll(" ",""));

        System.out.print("I (AMPERE) > ");
        Einheit.AMPERE.setValue(scanner.readString().replaceAll(" ",""));

        Einheit einheit = Einheit.values()[0];
        for(int i = 0; i < Einheit.values().length; i++) {
            if(einheit.getValue() == null) {
                break;
            } else {
                einheit = einheit.next();
            }
        }

        System.out.println("Zu findende Einheit : " + einheit);
        System.out.println(einheit + " = " + berechnen(einheit));
    }

    public double berechnen(Einheit einheit) {
        return switch(einheit) {
            case VOLT -> Einheit.AMPERE.getValue() * Einheit.OHM.getValue();
            case OHM -> Einheit.VOLT.getValue() / Einheit.AMPERE.getValue();
            case AMPERE -> Einheit.VOLT.getValue() / Einheit.OHM.getValue();
        };
    }

    public static void main(String[] args) {
        new Rechner();
    }
}