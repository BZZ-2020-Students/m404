package romanNumerals;

public enum RomanNumerals {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1),
    ;

    final int value;
    RomanNumerals(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private static final RomanNumerals[] vals = values();
    public RomanNumerals next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
