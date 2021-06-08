package airlinecorona;

public class Seat {
    private SeatState state;
    private int row;
    private int nrInRow;
    private String person;

    public Seat(SeatState state, int row, int nrInRow) {
        this.state = state;
        this.row = row;
        this.nrInRow = nrInRow;
    }

    public Seat(String person, int row, int nrInRow) {
        this.person = person;
        this.row = row;
        this.nrInRow = nrInRow;
        this.state = SeatState.OCCUPIED;
    }

    public SeatState getState() {
        return state;
    }

    public void setState(SeatState state) {
        this.state = state;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNrInRow() {
        return nrInRow;
    }

    public void setNrInRow(int nrInRow) {
        this.nrInRow = nrInRow;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
