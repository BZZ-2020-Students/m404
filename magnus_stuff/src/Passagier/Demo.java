package Passagier;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        new Demo().run();
    }
    public void run(){

        Passagier p1 = new Passagier("00", "Muster", "Hans", LocalDate.of(2000,2,6));
        Passagier p2 = new Passagier("01", "Mich", "Gerd", LocalDate.of(1995,3,12));
        Passagier p3 = new Passagier("02", "Mach", "Mark", LocalDate.of(1956,4,8));
        Passagier p4 = new Passagier("03", "Much", "Rans", LocalDate.of(1957,5,13));
        Passagier p5 = new Passagier("10", "Zwans", "Peter", LocalDate.of(2006,6,18));
        Passagier p6 = new Passagier("11", "Dans", "Karl", LocalDate.of(2020,8,16));
        Passagier p7 = new Passagier("12", "Hans", "Muni", LocalDate.of(2005,12,15));
        Passagier p8 = new Passagier("13", "Dans", "Sani", LocalDate.of(2004,3,7));
        Passagier p9 = new Passagier("20", "Kell", "Ralf", LocalDate.of(2007,2,6));
        Passagier p10 = new Passagier("21", "Kaln", "Wolff", LocalDate.of(1980,6,6));
        Passagier p11 = new Passagier("22", "Kals", "Rand", LocalDate.of(1975,2,8));
        Passagier p12 = new Passagier("23", "Mals", "Mal", LocalDate.of(1999,2,6));
        Passagier[][] list = {{p1,p2,p3,p4},{p5,p6,p7,p8},{p9,p10,p11,p12}};
        Control c = new Control();
        Passagier[] passagierFinal = c.control(list, p7);

        for(Passagier p : passagierFinal){
            if(p != null) System.out.println(p);
        }
    }
}
