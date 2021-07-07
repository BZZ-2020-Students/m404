package lerne;

import java.util.Scanner;

public class Verwaltung {
    // declare attributes
    static Scanner scanner;
    Einleser einlesen;

    /**
     * constructor: initialize attributes
     */
    public Verwaltung() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Verwaltung program = new Verwaltung();
        program.run();
        scanner.close();
    }

    public void run(){
        DiniMuetter diniMuetter = new DiniMuetter();

        DiniMuetter[] scil = diniMuetter.erfasseDiniMuetter();

        System.out.println(scil[0].getvorname());



    }
}
