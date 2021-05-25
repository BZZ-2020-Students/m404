package notentool;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run(){
        Note[] noten = {
                new Note(5,new Date(),0.5),
                new Note(4,new Date(),0.5),
                new Note(6,new Date(),1)
        };
        Note[] notenEn = {
                new Note(5.5,new Date(),1),
                new Note(4.5,new Date(),0.5),
                new Note(6,new Date(),1)
        };

        Fach[] faecher = {
                new Fach(noten,"Englisch",2,2005),
                new Fach(notenEn,"Deutsch",2,2005)
        };

        Schueler s1 = new Schueler(faecher,"Mustermann","Sebastian","01.02.2007","Männlich");

        System.out.println("Nachname: " + s1.getName() + "\nVorname: " + s1.getVorname() + "\nGeburtstag: " + s1.getGeburtstag());
        s1.printFaecher();
        System.out.println("------------------------------------------------------------------");
//        for (int i = 0; i < faecher.length; i++) {
//            System.out.println(faecher[i].getName() + "\n" + faecher[i].printNoten());
//            for (int y = 0; y < noten.length; y++) {
//                System.out.println("Note: "+noten[y].getWert() + "\nGewichtung: " + noten[y].getGewichtung() + "\nDatum: " + noten[y].getGewichtung());
//            }
//            System.out.println("------------------------------------------------------------------");
//        }




    }

}
