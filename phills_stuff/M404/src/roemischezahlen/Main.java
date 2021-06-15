package roemischezahlen;

import java.util.Scanner;

public class Main {
    static Scanner scanner;
    Einleser einleser;

    public Main(){
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main demo = new Main();

        demo.run();
    }

    public void run(){
        einleser = new Einleser();
        System.out.println("Ganzzahl: ");
        int zahl = einleser.readInt();
        if(zahl > 9999 || zahl < 1) {
            System.out.println("Die Zahl muss zwischen 1 - 9999 liegen");
        }else{
            System.out.println("Die Römische Zahl von " + zahl + " ist: " + umwandeln(zahl));
        }



    }

    private static String umwandeln(int zahl) {
        String roemisch = "";

        int[] werte = { 1000, 500, 100, 50, 10, 5, 1 };
        char[] zeichen = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

        int index = 0;
        while (zahl > 0) {
            if (zahl >= werte[index]) {
                zahl = zahl - werte[index];
                roemisch += zeichen[index];
            } else {
                index++;
            }

        }
        return roemisch;
    }
}
