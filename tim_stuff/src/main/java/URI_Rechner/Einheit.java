package URI_Rechner;

public enum Einheit {
    VOLT,
    OHM,
    AMPERE;

    private Double value;

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

    private static Einheit[] vals = values();
    public Einheit next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
