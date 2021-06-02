package ampereberechnen;

import java.util.Scanner;

public class Main {
    // declare attributes
    static Scanner scanner;
    Einleser einlesen;
    Berechnung berechnung;

    /**
     * constructor: initialize attributes
     */
    public Main() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        berechnung = new Berechnung();
        einlesen = new Einleser();
        String u;
        String r;
        String i;
        System.out.println("U: = >");
        u = einlesen.readString();
        System.out.println("R: = >");
        r = einlesen.readString();
        System.out.println("I: = >");
        i = einlesen.readString();

        if(i.equals("?")){
            berechnung.berechneni(u,r);
        }else if (u.equals("?")){
            berechnung.berechnenu(i,r);
        }else if (r.equals("?")){
            berechnung.berechnenr(u,i);
        }else{
            System.out.println("Sie müssen ein ? platzieren");
        }


        }
}
