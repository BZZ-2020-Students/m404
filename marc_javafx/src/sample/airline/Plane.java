package sample.airline;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private Seat[][] seats;
    private String flight;

    public Plane(Seat[][] seats, String flight) {
        this.seats = seats;
        this.flight = flight;
    }

    public Plane() {

    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFormattedSeats() {
        StringBuilder out = new StringBuilder();
        for (Seat[] seat : seats) {
            for (Seat value : seat) {
                out.append(value.getState().getDisplay());
            }
            out.append(System.lineSeparator());
        }
        return out.toString();
    }

    public List<Seat> getInfectedSeats() {
        List<Seat> out = new ArrayList<>();

        for (Seat[] seat : seats) {
            for (Seat value : seat) {
                if (value.getState() == SeatState.INFECTED) out.add(value);
            }
        }

        return out;
    }
}
