package scannen;

import java.time.LocalDate;
import java.util.Scanner;

public class Scann {
    static Scanner scanner;
    public Scann(){
        scanner = new Scanner(System.in);
    }
    public double readDouble() {
        while (!scanner.hasNextDouble()){
            System.out.println("Bitte gib eine Zahl ein!");
            scanner.next();
        }
        double zahl = scanner.nextDouble();
        return zahl;
    }

    public int readInt() {
        while (!scanner.hasNextInt()){
            System.out.println("Bitte gib eine Ganzzahl ein!");
            scanner.next();
        }
        int zahl = scanner.nextInt();
        return zahl;
    }

    public boolean readBoolean() {
        while (!scanner.hasNextBoolean()){
            System.out.println("Bitte gib \"true\" oder \"false\" ein!");
            scanner.next();
        }
        boolean bool = scanner.nextBoolean();
        return bool;
    }

    public boolean readBooleanWort() {
        boolean bool;
        String eingabe = scanner.nextLine();
        if(eingabe.equalsIgnoreCase("Ja")){
            bool = true;
        }else if(eingabe.equalsIgnoreCase("Nein")){
            bool = false;
        }else{
            System.out.println("Bitte gib \"Ja\" oder \"Nein\" ein!");
            bool = readBoolean();
        }
        return bool;
    }

    public char readChar() {
       char ch = scanner.nextLine().charAt(0);
       while (!Character.isLetter(ch)){
           System.out.println("Bitte gib einen Buchstaben ein!");
           ch = scanner.nextLine().charAt(0);
       }
       return ch;
    }

    public LocalDate readDate(){
        int year;
        int month;
        int day;
        System.out.println("Bitte das Jahr angeben: ");
        year = readInt();
        System.out.println("Bitte den Monat angeben: ");
        month = readInt();
        System.out.println("Bitte den Tag angeben: ");
        day = readInt();
        LocalDate datum = LocalDate.of(year, month, day);
        return datum;
    }
}
