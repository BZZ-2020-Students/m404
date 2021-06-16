package numerals;


import java.util.Scanner;

public class NumeralsDemo {
    public static void main(String[] args) {
        new NumeralsDemo().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        String again = "yes";


        while (again.equals("yes")) {
            String numerals = "";
            String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};
            int[] numbers = {1000, 500, 100, 50, 10, 5, 1};
            double input;
            int nr = 0;
            int index = 0;

            System.out.print("Enter a number (1-9999)> ");
            input = sc.nextDouble();

            if(input < 1|| input > 9999){
                System.out.println("Out of bounds!");
            }else if(input != (int)input){
                System.out.println("Enter a natural number!");
            }else{
                nr += input;
                do {
                    if (nr >= numbers[index]) {
                        numerals += symbols[index];
                        nr = nr - numbers[index];
                    } else {
                        index++;
                    }
                } while (nr > 0);

                System.out.println("Roman numerals to " + (int)input + " are: " + numerals);
                System.out.println("----------------------------");
                System.out.print("Would you like to convert another number? [yes/no] > ");
                sc.nextLine();
                again = sc.nextLine();
            }


        }
    }

}
