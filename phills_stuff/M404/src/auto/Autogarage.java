package auto;

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
        Autogarage program = new Autogarage();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {

        Auto auto1 = new Auto(350,"Orange","Lamborghini","Miura",90,"986624",20);
        Auto auto2 = new Auto(286,"Silber","Aston Martin","DB5",86.4,"000007",18);
        Auto auto3 = new Auto(478,"Rot","Ferrari","F40",120,"40500",9.8);
        Auto auto4 = new Auto(485,"Weiss","Ford","GT40",125.5,"162340",10);


        Auto autos[] = {auto1,auto2,auto3,auto4};

        for (int i = 0; i < 4; i++) {

            autos[i].ausgeben();
            autos[i].fahren();
            autos[i].tanken();
            System.out.println();
        }

    }
}