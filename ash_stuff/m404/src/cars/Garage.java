package cars;

import java.util.Scanner;

public class Garage {


        // declare attributes
        static Scanner scanner;

        /**
         * constructor: initialize attributes
         */
        public Garage() {
            scanner = new Scanner(System.in);
        }

        /**
         * starts the execution änderung
         *
         * @param args
         *            command line arguments
         */
        public static void main(String[] args) {
            Garage program = new Garage();
            program.run();
            scanner.close();
        }

        /**
         * description
         */
        private void run() {
            Car car1 = new Car(505, "red", "chevrolet", "253-ABW", 100);
            Car car2 = new Car(130, "gray", "DMC", "AYA-543", 100);
            Car car3 = new Car(592, "white", "Toyota", "446-BUH", 100);
            Car car4 = new Car(400, "black", "BMW", "238-EMS", 100);
            Car car5 = new Car(230, "blue", "porsche", "656-OES", 100);
        }
    }

