package calculator;

import java.util.Scanner;

public class Calculus {
    static Scanner sc;
    public Calculus(){
        sc = new Scanner(System.in);
    }
    public double add(double nr1, double nr2){
        return nr1 + nr2;
    }
    public double subtract(double nr1, double nr2){
        return nr1 - nr2;
    }
    public double multiply(double nr1, double nr2){
        return nr1 * nr2;
    }
    public double divide(double nr1, double nr2){
        if(nr2 == 0){
            System.out.print("Can not be divided with 0. Enter a valid number >");
            nr2 = sc.nextDouble();
            sc.nextLine();
        }
        return nr1 / nr2;
    }


}
