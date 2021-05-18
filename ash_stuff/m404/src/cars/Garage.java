package cars;

import java.util.Scanner;
import java.util.Random;

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
         * starts the execution
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
            Car car1 = new Car(505, "red", "chevrolet", "253-ABW", (int)(Math.random() * 300 + 1));
            Car car2 = new Car(130, "gray", "DMC", "AYA-543", (int)(Math.random() * 300 + 1));
            Car car3 = new Car(592, "white", "Toyota", "446-BUH", (int)(Math.random() * 300 + 1));
            Car car4 = new Car(400, "black", "BMW", "238-EMS", (int)(Math.random() * 300 + 1));
            Car car5 = new Car(230, "blue", "porsche", "656-OES", (int)(Math.random() * 300 + 1));
            Car[] cars = {car1, car2, car3, car4, car5};
            int i = 1;

            for (Car c : cars) {
                c.drive(50);
                if(c.getFuel() < 0){
                    System.out.println("Car "+ i + ": Out of fuel!");
                    c.setFuel(0);
                }else{

                System.out.println( "Car "+ i + ": Current amount of fuel: " + c.getFuel());

                }
                i++;
            }
            System.out.println();
            System.out.print("Enter the amount you want to tank >");
            int tank = scanner.nextInt();
            int j = 1;
            for (Car c: cars) {
                c.tankFuel(tank);
                System.out.println( "Car "+ j + ": Current amount of fuel: " + c.getFuel());
                j++;
            }
        }
    }

