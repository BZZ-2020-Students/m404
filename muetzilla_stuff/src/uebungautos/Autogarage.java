package uebungautos;


import java.util.Scanner;

public class Autogarage {

    // declare attributes
    static Scanner scanner;

    /**
     * constructor: initialize attributes
     */
    public Autogarage() {
        scanner = new Scanner(System.in);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Autogarage autogarage = new Autogarage();
        autogarage.run();
        scanner.close();
    }

    /**
     * Es werden 5 Autos erstellt und ihre Werte werden ausgegeben. Ausserdem können diese fahren -> Tank nimmt ab und tanken -> Tank nimmt zu.
     */
    private void run() {
        String[] automarken = {
            "BMW",
            "MERCEDES",
            "PORSCHE",
            "VW",
            "AUDI"
        };
        String [] farben = {
                "ROT",
                "BLAU",
                "GELB",
                "GRAU",
                "GRÜN"
        };
      /* Auto a1 = new Auto(350, "ROSA", "BMW", 420, "Muetzilla-Industries-001");
       Auto a2 = new Auto(126, "ROT", "MERCEDES", 57, "Muetzilla-Industries-002");
       Auto a3 = new Auto(723, "GELN", "PORSCHE", 234, "Muetzilla-Industries-003");
       Auto a4 = new Auto(356, "BLAU", "VW", 845, "Muetzilla-Industries-004");
       Auto a5 = new Auto(623, "GRÜN", "AUDI", 235, "Muetzilla-Industries-005");
       */
        Auto a1 = new Auto();
        a1.setLeistung(236);
        a1.setFarbe("ROT");
        a1.setKennzeichen("ZH-1234");
        a1.setKraftstoffmenge(125);
        a1.setMarke("AUDI");

       System.out.println(a1.toString());
      /* System.out.println(a2.toString());
       System.out.println(a3.toString());
       System.out.println(a4.toString());
       System.out.println(a5.toString());*/
       a1.fahren(20);
       System.out.println(a1.toString());
       a1.tanken(200);
        System.out.println(a1.toString());
    }
}
