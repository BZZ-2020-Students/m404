package bzair;

import scanner.Scan;

import java.time.LocalDate;


public class Flugzeug {
    Scan scanner;

    public static void main(String[] args) {
        Flugzeug flugzeug = new Flugzeug();
        flugzeug.run();
    }

    public void run() {
        int anzahlReihen = 5;
        //max 9 Plätze pro Reihe
        int anzahlSitzeProReihe = 9;
        Passagier[][] passagiere = new Passagier[anzahlReihen][anzahlSitzeProReihe];
        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                String sitzplatzString = String.valueOf((i));
                sitzplatzString += (j + 1);
                int sitzplatzInt = Integer.parseInt(sitzplatzString);
                System.out.println(sitzplatzInt);
                passagiere[i][j] = new Passagier(sitzplatzInt, "Max", "Mustermann", LocalDate.of(2004, 04, 06), false);
            }
        }
        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                System.out.println(passagiere[i][j].toString());
            }
        }
    }

    public int[] findSeat(Passagier p, int anzahlReihen) {
        int[] seat = new int[2];
        int sitznummer = p.getSitznummer();
        int reihe = sitznummer / anzahlReihen;
        int sitz = sitznummer % anzahlReihen;
        seat[0] = reihe;
        seat[1] = sitz;
        return seat;
    }

    public Passagier[] getQuarantiedPerson(int seat[], Passagier[][] passagiers) {
        return null;
    }
}
