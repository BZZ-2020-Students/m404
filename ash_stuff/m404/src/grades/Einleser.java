package grades;

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
        double nr = sc.nextDouble();
        sc.nextLine();
        return nr;
    }
    public char readChar() {
        char ch = sc.nextLine().charAt(0);
        while (!Character.isLetter(ch)) {
            System.out.print("Enter a character >");
            ch = sc.nextLine().charAt(0);
        }
        return ch;
    }
    public int readInt(){
        while(!sc.hasNextInt()){
            System.out.println("Enter a number");
            sc.next();
        }
        int i = sc.nextInt();
        return i;
    }
}
