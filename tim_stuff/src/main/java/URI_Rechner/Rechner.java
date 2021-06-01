package URI_Rechner;

public class Rechner {

    Einleser scanner = new Einleser();

    public Rechner() {
        for(Einheit einheit : Einheit.values()) {
            System.out.print(einheit + " (" + einheit.getShortName() + ") > ");
            einheit.setValue(scanner.readString().replaceAll(" ",""));
        }

        Einheit einheit = Einheit.values()[0];
        for(int i = 0; i < Einheit.values().length; i++) {
            if(einheit.getValue() == null) {
                break;
            } else {
                einheit = einheit.next();
            }
        }

        // System.out.println("Zu findende Einheit : " + einheit);
        System.out.println(einheit + " (" + einheit.getShortName() + ") = " + berechnen(einheit));
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