package PythagorasRechner;

public enum Seiten {
    SEITE_a,
    SEITE_b,
    SEITE_c;

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

    private static Seiten[] vals = values();
    public Seiten next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
