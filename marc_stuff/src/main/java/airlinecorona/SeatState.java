package airlinecorona;

public enum SeatState {
    EMPTY(". "),
    OCCUPIED("- "),
    INFECTED("X ");

    private final String display;

    SeatState(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
