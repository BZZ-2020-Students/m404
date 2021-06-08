package sample.airline;

public enum SeatState {
    EMPTY(". "),
    OCCUPIED("O "),
    INFECTED("X ");

    private final String display;

    SeatState(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
