package scanner;

import java.util.Scanner;

public class Einleser {
    static Scanner sc;
    public Einleser(){
        sc =new Scanner(System.in);
    }

    public double readDouble(){
        while(!sc.hasNextDouble()) {
            System.out.print("Enter a number >");
            sc.next();
        }
        double nr1 = sc.nextDouble();
        sc.nextLine();
        return nr1;
    }

    public double readDouble(String input) {
        System.out.println(input);
        return readDouble();
    }

    public char readChar() {
        char ch = sc.nextLine().charAt(0);

        return ch;
    }

    public String readString() {
        String s = sc.nextLine();
        return s;
    }

    public String readString(String input) {
        System.out.print(input);
        return readString();
    }

}
