package practice;

import java.util.Scanner;

public class practiceEinleser {
    static Scanner sc;

    public practiceEinleser() {
        sc = new Scanner(System.in);
    }

    public int readInt(){
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }
}
