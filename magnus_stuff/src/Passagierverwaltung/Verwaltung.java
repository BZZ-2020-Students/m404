package Passagierverwaltung;

import java.time.LocalDate;
import java.util.Random;

public class Verwaltung {
    final int AMOUNT_ROWS = 10;
    final int AMOUNT_SEATS_PER_ROW = 6;

    public Verwaltung() {
        run();
    }

    /*

        X = corona
        O = neben Corona

        OOO***
        OXO***
        OOO***
        ******
        ******
        [1,1] -> Corona
        = [0,0], [0,1], [0,2], [1,0], [1,2], [2,0], [2,1], [2,2] -> möglich Corona


        OXO***
        OOO***
        ******
        ******
        ******
        [0,1] -> Corona
        = [0,0], [0,2], [1,0], [1,1], [1,2] -> möglich corona

         */

    private void run() {
        String[] vornamen = {"Phillip", "Tim", "Marc", "Alyssa", "Magnus", "Moritz"};
        String[] nachnamen = {"Jerebic", "Irmler", "Fuchs", "Heimlicher", "Goetz", "Gasbichler"};
        Passagier[][] passagiere = new Passagier[AMOUNT_ROWS][AMOUNT_SEATS_PER_ROW];
        for (int i = 0; i < passagiere.length; i++) {
            for (int j = 0; j < passagiere[i].length; j++) {
                passagiere[i][j] = new Passagier(i, j, nachnamen[getRandomIndex(nachnamen.length)],
                        vornamen[getRandomIndex(vornamen.length)], LocalDate.now(), '*');
            }
        }

        System.out.println(seatsToString(passagiere));

        Einleser scanner = new Einleser();
        System.out.print("In welcher Reihe (0-" + (AMOUNT_ROWS-1) + ") und welchem Sitz (0-"+ (AMOUNT_SEATS_PER_ROW-1) +") ist der Covid infizierte Passagier? (getrennt mit Komma) > ");
        String input = scanner.readString();
        input = input.replaceAll(" ", "");
        String[] inputs = input.split(",");

        int reihe = Integer.parseInt(inputs[0]);
        int sitz = Integer.parseInt(inputs[1]);

        setAllCorona(passagiere, reihe, sitz);
        System.out.println(seatsToString(passagiere));

        System.out.println(infectedToString(passagiere));
    }

    private void setAllCorona(Passagier[][] passagiere, int reihe, int sitz) {
        System.out.println("Infected on row " + reihe + " and seat " + sitz);

        Passagier coronaInfected = passagiere[reihe][sitz];
        coronaInfected.setState('X');

        int startPosX = (sitz - 1 < 0) ? sitz : sitz - 1;
        int startPosY = (reihe - 1 < 0) ? reihe : reihe - 1;
        int endPosX = (sitz + 1 > AMOUNT_SEATS_PER_ROW-1) ? sitz : sitz + 1;
        int endPosY = (reihe + 1 > AMOUNT_ROWS-1) ? reihe : reihe + 1;
        System.out.println("Start: {X:" + startPosX + ",Y:" +
                startPosY + "},End: {X:" +
                endPosX + ",Y:" +
                endPosY + "}");

        for (int rowNum = startPosY; rowNum <= endPosY; rowNum++) {
            for (int colNum = startPosX; colNum <= endPosX; colNum++) {
                Passagier passagierToBeWarned = passagiere[rowNum][colNum];
                if(passagierToBeWarned != coronaInfected) {
                    passagierToBeWarned.setState('O');
                }
            }
        }
    }

    private String infectedToString(Passagier[][] passagiere) {
        String out = "Start Passagier: ";
        String toBeWarnedPassagiere = "Folgende Passagiere sind möglicherweise Infiziert und werden entsprechend gewarnt {\n";
        for (int i = 0; i < passagiere.length; i++) {
            for (Passagier passagier : passagiere[i]) {
                if(passagier.getState() == 'X') {
                    out += passagier + "\n";
                } else if(passagier.getState() == 'O') {
                    toBeWarnedPassagiere += passagier + "\n";
                }
            }
        }
        out += toBeWarnedPassagiere + "}";
        return out;
    }

    private String seatsToString(Passagier[][] passagiere) {
        String out = "";
        for (int i = 0; i < passagiere.length; i++) {
            out += String.format("%s%-3d%s", "Reihe ", i, ": ");
            for (Passagier passagier : passagiere[i]) {
                out += passagier.getState();
            }
            out += "\n";
        }
        return out;
    }

    private int getRandomIndex(int arrayLength) {
        Random r = new Random();
        return r.nextInt(arrayLength);
    }

    public static void main(String[] args) {
        new Verwaltung();
    }
}