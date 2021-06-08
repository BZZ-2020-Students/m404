package URI_Rechner;

public enum Einheit {
    VOLT("U"),
    OHM("R"),
    AMPERE("I");

    private Double value;
    private final String shortName;

    Einheit(String shortName) {
        this.shortName = shortName;
    }

    public void setValue(String s) {
        if(s.charAt(0) == '?') {
            this.value = null;
        } else {
            this.value = Double.parseDouble(s);
        }
    }

    public Double getValue() {
        return this.value;
    }

    public String getShortName() {
        return this.shortName;
    }

    private static Einheit[] vals = values();
    public Einheit next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
