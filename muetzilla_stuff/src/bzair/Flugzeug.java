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
        Passagier positiverPasagier = null;

        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                String sitzplatzString = String.valueOf((i));
                sitzplatzString += (j + 1);
                int sitzplatzInt = Integer.parseInt(sitzplatzString);
                passagiere[i][j] = new Passagier(sitzplatzInt, "Max", "Mustermann", LocalDate.of(2004, 6, 6), false);
            }
        }
        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                if (passagiere[i][j].getPositivesTestergebnis()) {
                    positiverPasagier = passagiere[i][j];
                }
            }
        }
        if (positiverPasagier != null) {
            int[] sitzplatzPositivePerson = findSeat(positiverPasagier, anzahlReihen);
            Passagier[] quarantaenePassagiere = getQuarantiedPerson(sitzplatzPositivePerson, passagiere, anzahlReihen, anzahlSitzeProReihe);
            System.out.println("Folgende Passagiere müssen sich in Quarantäne begeben: ");
            for (int i = 0; i < quarantaenePassagiere.length; i++) {
                System.out.println(quarantaenePassagiere[i].toString());
            }
        } else {
            System.out.println("Es ist kein Passagier mit einem positivem Test vorhanden.");
        }
    }

    public int[] findSeat(Passagier p, int anzahlReihen) {
        int[] seat = new int[2];
        int sitznummer = p.getSitznummer();
        int reihe = sitznummer / anzahlReihen;
        int sitz = sitznummer % anzahlReihen - 1;
        seat[0] = reihe;
        seat[1] = sitz;
        return seat;
    }

    public Passagier[] getQuarantiedPerson(int seat[], Passagier[][] passagiers, int anzhalReihen, int anzahlSitzeProReihe) {
        Passagier[] betroffenePersonen = new Passagier[8];
        int reihe = seat[0];
        int sitz = seat[1];
        //Wird überarbeitet...
        if (reihe == 0) {
            if (sitz == 0) {
                betroffenePersonen[0] = passagiers[reihe][sitz + 1];
                betroffenePersonen[1] = passagiers[reihe + 1][sitz + 1];
                betroffenePersonen[2] = passagiers[reihe + 1][sitz];
            } else {
                betroffenePersonen[0] = passagiers[reihe - 1][sitz];
                betroffenePersonen[1] = passagiers[reihe - 1][sitz + 1];
                betroffenePersonen[2] = passagiers[reihe][sitz + 1];
                betroffenePersonen[3] = passagiers[reihe + 1][sitz + 1];
                betroffenePersonen[4] = passagiers[reihe + 1][sitz];
            }
        } else if (sitz == 0) {
            betroffenePersonen[0] = passagiers[reihe][sitz + 1];
            betroffenePersonen[1] = passagiers[reihe + 1][sitz + 1];
            betroffenePersonen[2] = passagiers[reihe + 1][sitz];
            betroffenePersonen[3] = passagiers[reihe + 1][sitz - 1];
            betroffenePersonen[4] = passagiers[reihe][sitz - 1];

        } else if (reihe == anzhalReihen) {
            if (sitz == anzahlSitzeProReihe) {
                betroffenePersonen[0] = passagiers[reihe - 1][sitz - 1];
                betroffenePersonen[1] = passagiers[reihe - 1][sitz];
                betroffenePersonen[2] = passagiers[reihe][sitz - 1];

            } else {
                betroffenePersonen[0] = passagiers[reihe - 1][sitz - 1];
                betroffenePersonen[0] = passagiers[reihe - 1][sitz];
                betroffenePersonen[5] = passagiers[reihe + 1][sitz - 1];
            }
        } else if (sitz == anzahlSitzeProReihe) {
            betroffenePersonen[0] = passagiers[reihe - 1][sitz - 1];
            betroffenePersonen[1] = passagiers[reihe - 1][sitz];
            betroffenePersonen[2] = passagiers[reihe][sitz - 1];
            betroffenePersonen[3] = passagiers[reihe + 1][sitz - 1];
            betroffenePersonen[4] = passagiers[reihe + 1][sitz];
        } else if (sitz == anzahlSitzeProReihe && reihe == 0) {
            betroffenePersonen[0] = passagiers[reihe][sitz - 1];
            betroffenePersonen[1] = passagiers[reihe - 1][sitz - 1];
            betroffenePersonen[2] = passagiers[reihe - 1][sitz];
        } else {
            betroffenePersonen[0] = passagiers[reihe - 1][sitz - 1];
            betroffenePersonen[1] = passagiers[reihe - 1][sitz];
            betroffenePersonen[2] = passagiers[reihe - 1][sitz + 1];
            betroffenePersonen[3] = passagiers[reihe][sitz - 1];
            betroffenePersonen[4] = passagiers[reihe - 1][sitz + 1];
            betroffenePersonen[5] = passagiers[reihe + 1][sitz - 1];
            betroffenePersonen[6] = passagiers[reihe + 1][sitz];
            betroffenePersonen[7] = passagiers[reihe + 1][sitz + 1];
        }
        return betroffenePersonen;
    }
}
