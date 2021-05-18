package demos;

import classes.Car;

import java.util.ArrayList;

public class CarDemo {
    public static void main(String[] args) {
        new CarDemo().run();
    }

    private void run() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(323, "purple", "Nissan", 50, "H69JK"));
        cars.add(new Car(124, "white", "renault", 60, "59135"));
        System.out.println(cars);

        for (Car c : cars)
            c.drive((int) (Math.random() * 45));

        System.out.println(cars);

        for (Car c : cars)
            c.tank();

        System.out.println(cars);
    }
}
