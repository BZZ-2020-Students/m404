package Taschenrechner;

import Taschenrechner.Math.AbstractMath;
import Taschenrechner.Math.Addition;
import Taschenrechner.Math.Subtraction;

import java.util.ArrayList;
import java.util.HashMap;

public class Rechner {
    private HashMap<Character, AbstractMath> mathList = new HashMap();
    private final char[] validOperatoren = {'+','-'};
    Einleser scanner = new Einleser();

    public Rechner() {
        run();
    }

    public void run() {
        initAbstractMath();

        System.out.println("Geben sie bitte ihre Rechnung ein: ");

        mathInterpreter(scanner.readString());
    }

    public void mathInterpreter(String mathString) {
        mathString = mathString.replaceAll(" ", "");

        ArrayList<Character> allFoundOperatoren = new ArrayList<Character>();

        for (int i = 0; i < mathString.length(); i++){
            char c = mathString.charAt(i);
            for(int j = 0; j < validOperatoren.length; j++) {
                if(c == validOperatoren[j]) {
                    allFoundOperatoren.add(c);
                }
            }
        }

        System.out.println("Found Operatoren: " + allFoundOperatoren.toString());

        for(char c : allFoundOperatoren) {
            double num1;
            double num2;
            double zwischenResult;
            if(mathList.containsKey(c)) {
                zwischenResult = mathList.get(c).calculate(2,1);
                System.out.println(zwischenResult);
            }
        }
    }

    public void initAbstractMath() {
        mathList.put('+', new Addition());
        mathList.put('-', new Subtraction());
    }

    public static void main(String[] args) {
        new Rechner();
    }
}