package numerals;


import java.util.Scanner;

public class NumeralsDemo {
    public static void main(String[] args) {
        new NumeralsDemo().run();
    }

    public void run(){
        Scanner sc= new Scanner(System.in);

        String numerals = "";
        String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};
        int[] numbers = {1000, 500, 100, 50, 10, 5, 1};
        int input;
        int nr = 0;
        int index = 0;


        System.out.print("Enter a number >");
        input = sc.nextInt();

        nr += input;
        do{
            if(nr >= numbers[index]){
                numerals += symbols[index];
                nr = nr - numbers[index];
            }else{
                index++;
            }
        }while(nr > 0);

        System.out.println("Roman numerals to "+ input + " are: " + numerals);
    }

}
