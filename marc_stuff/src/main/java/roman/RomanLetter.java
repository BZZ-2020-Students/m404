package roman;

public enum RomanLetter {
    M( 1000),
    D( 500),
    C(100),
    L( 50),
    X( 10),
    V(5),
    I(1);

    private final int value;

    RomanLetter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public RomanLetter getPrevious() {
        return values()[(this.ordinal() - 1) % values().length];
    }
}
