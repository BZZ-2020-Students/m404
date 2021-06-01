package calculations;

public enum Unit {
    CURRENT,
    VOLTAGE,
    RESISTANCE;

    public Unit next() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}
