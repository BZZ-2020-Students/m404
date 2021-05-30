package calculator;

import java.util.Scanner;

public class Rechner {
    static Scanner sc;
    public static void main(String[] args) {
        new Rechner().run();
    }
    public void run(){
        Einleser el = new Einleser();
        Calculus c = new Calculus();

        System.out.println("-------------Calculator-------------");
        System.out.println();
        System.out.print("Enter the first number >");
        double nr1 = el.readDouble();
        System.out.println();
        System.out.print("Enter the second number >");
        double nr2 = el.readDouble();
        System.out.print("Enter the operator >");
        char op = el.readChar();

       switch(op){
           case '+':
               System.out.println(c.add(nr1, nr2));
               break;
           case '-':
               System.out.println(c.subtract(nr1, nr2));
               break;
           case '*':
               System.out.println(c.multiply(nr1, nr2));
               break;
           case '/':
               System.out.println(c.divide(nr1, nr2));
               break;
       }


    }
}
