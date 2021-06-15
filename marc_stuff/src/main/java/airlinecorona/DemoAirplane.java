package airlinecorona;

import scanner.InputReader;

import java.util.ArrayList;
import java.util.List;

public class DemoAirplane {
    public static void main(String[] args) {
        new DemoAirplane().run();
    }

    private void run() {
        Plane plane = new Plane();
        InputReader ir = new InputReader();
        int rows;
        int seatsInRow;
        Seat[][] seats;

        System.out.print("Enter the name of the flight > ");
        plane.setFlight(ir.readString());

        System.out.print("Enter the amount of rows of seats in the plane > ");
        rows = ir.readInt();

        System.out.print("Enter the amount of seats per row > ");
        seatsInRow = ir.readInt();

        seats = new Seat[rows][seatsInRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsInRow; j++) {
                seats[i][j] = new Seat(randomString((int) (Math.random() * 15)), i, j);
            }
        }
        plane.setSeats(seats);

        System.out.print("Enter the seat position of the infected person (ex. 5,6) > ");
        String posS = ir.readString();

        int[] infectedPos = convertStrToInt(posS, ",");

        if (infectedPos[0] < 0 || infectedPos[0] > rows - 1 || infectedPos[1] < 0 || infectedPos[1] > seatsInRow - 1) {
            System.out.println("This Seat does not exist please rerun the program");
            return;
        }

        plane.getSeats()[infectedPos[0]][infectedPos[1]].setState(SeatState.INFECTED);

        setNeighborsInfected(infectedPos[0], infectedPos[1], plane);

        System.out.println("----------" + plane.getFlight() + "----------");
        System.out.println("X -> Infected | O -> Occupied | . -> Empty");
        System.out.println(plane.getFormattedSeats());

        System.out.println("People who need to be informed: ");
        List<Seat> infectedSeats = plane.getInfectedSeats();
        for (Seat s : infectedSeats)
            System.out.println(s.getPerson() + "on seat: " + s.getRow() + "," + s.getNrInRow());
    }

    public void setNeighborsInfected(int row, int seat, Plane plane) {
        ArrayList<Integer[]> positions = new ArrayList<>();
        positions.add(new Integer[]{row - 1, seat});
        positions.add(new Integer[]{row + 1, seat});
        positions.add(new Integer[]{row, seat - 1});
        positions.add(new Integer[]{row, seat + 1});
        positions.add(new Integer[]{row + 1, seat + 1});
        positions.add(new Integer[]{row - 1, seat + 1});
        positions.add(new Integer[]{row + 1, seat - 1});
        positions.add(new Integer[]{row - 1, seat - 1});

        for (Integer[] i : positions) {
            try {
                plane.getSeats()[i[0]][i[1]].setState(SeatState.INFECTED);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Seat is near wall, neighbor was ignored!");
            }
        }
    }

    public int[] convertStrToInt(String s, String split) {
        String[] in = s.split(split);
        int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++)
            out[i] = Integer.parseInt(in[i]);

        return out;
    }

    public String randomString(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt((int) (Math.random() * chars.length())));
        return sb.toString();
    }
}
