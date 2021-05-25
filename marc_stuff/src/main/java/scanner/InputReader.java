package scanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    private final Scanner sc = new Scanner(System.in);

    public double readDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid Double!");
            sc.next();
        }
        double out = sc.nextDouble();
        sc.nextLine();
        return out;
    }

    public double[] readDoubleArray(String regex) {
        boolean correct = false;
        String input;
        double[] out;

        ArrayList<Double> finalNumbers = null;

        while (!correct) {
            input = sc.nextLine();
            String[] is = input.split(regex);

            finalNumbers = new ArrayList<>();

            try {
                for (String s : is)
                    finalNumbers.add(Double.parseDouble(s));
                correct = true;

            } catch (Exception e) {
                System.out.println("Please enter numbers split with (" + regex + ")");
            }
        }

        out = new double[finalNumbers.size()];
        for (int i = 0; i < finalNumbers.size(); i++)
            out[i] = finalNumbers.get(i);

        return out;
    }

    public int readInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid Integer!");
            sc.next();
        }
        int out = sc.nextInt();
        sc.nextLine();
        return out;
    }

    public boolean readBool() {
        while (!sc.hasNextBoolean()) {
            System.out.println("Please enter a valid boolean!");
            sc.next();
        }
        boolean out = sc.nextBoolean();
        sc.nextLine();
        return out;
    }

    public char readChar() {
        return sc.nextLine().charAt(0);
    }

    public LocalDate readLocalDate() {
        String date = null;
        LocalDate out = null;
        while (out == null && sc.hasNextLine()) {
            date = sc.nextLine();
            try {
                out = LocalDate.parse(date);
            } catch (Exception e) {
                System.out.println("Please enter a valid Date! (yyyy-MM-dd)");
            }
        }
        return out;
    }

    public String readString() {
        while (!sc.hasNextLine()) {
            System.out.println("Please enter a string!");
            sc.next();
        }
        return sc.nextLine();
    }
}
