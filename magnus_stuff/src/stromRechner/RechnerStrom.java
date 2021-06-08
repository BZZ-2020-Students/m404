package stromRechner;

import java.util.Scanner;

public class RechnerStrom {
    public static void main(String[] args) {
        new RechnerStrom().run();
    }
    public RechnerStrom(){
        System.out.println("Willkommen beim Strom Umrechner");
        System.out.println("Gib zuerst U<Volt>, dann R<Ohm> und zuletz I<Ampère> an. Bei der gewünschten fehlenden Zahl gib ein ? ein.");
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        StromCal stromCal = new StromCal();
        double result = 0;
        String antwort = null;
        String i;
        String r;
        String u;
        System.out.print("U > ");
        u = scanner.nextLine();
        System.out.print("R > ");
        r = scanner.nextLine();
        System.out.print("I > ");
        i = scanner.nextLine();

        if(u.equals("?")){
            antwort = "Ergebnis U";
            result = stromCal.uCalculate(Double.valueOf(r), Double.valueOf(i));
        }else if(r.equals("?")){
            antwort = "Ergebnis R";
            result = stromCal.rCalculate(Double.valueOf(u), Double.valueOf(i));
        }else if(i.equals("?")){
            antwort = "Ergebnis I";
            result = stromCal.iCalculate(Double.valueOf(u), Double.valueOf(r));
        }else{
            System.out.println("Fehler");
        }

        System.out.println(antwort + " : " + result);
    }

}
