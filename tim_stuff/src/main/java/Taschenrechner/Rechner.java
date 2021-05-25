package Taschenrechner;

import Taschenrechner.Math.AbstractMath;
import Taschenrechner.Math.Addition;
import Taschenrechner.Math.Subtraction;

import java.util.ArrayList;
import java.util.HashMap;

public class Rechner {
    private HashMap<Character, AbstractMath> mathList = new HashMap();
    private final char[] validOperatoren = {'+','-'};
    String mathString;
    Einleser scanner = new Einleser();

    public Rechner() {
        run();
    }

    public void run() {
        initAbstractMath();

        System.out.println("Geben sie bitte ihre Rechnung ein: ");
        mathInterpreter(scanner.readString());
        //mathInterpreter("123+456+789");
    }

    public void mathInterpreter(String _mathString) {
        mathString = _mathString.replaceAll(" ", "");

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

        int amountOperators = allFoundOperatoren.size();
        int counter = 1;

        boolean debug = true;

        Double num1 = null;
        double num2;
        double zwischenResult;
        for(char c : allFoundOperatoren) {
            if(mathList.containsKey(c)) {
                if(num1 == null) {
                    num1 = findNum(c,false, debug);
                }
                boolean lastNum = false;
                if(counter == amountOperators) {
                    lastNum = true;
                }
                num2=findNum(c,lastNum, debug);

                zwischenResult = mathList.get(c).calculate(num1,num2);
                System.out.println(num1 + " " + c + " " + num2 + " = " + zwischenResult);
                num1 = zwischenResult;
            } else {
                System.out.println("Operator " + c + " is unknown!");
            }

            counter++;
        }
    }

    public double findNum(char operator, boolean lastNum, boolean debug) {
        int operatorPosition;
        int endOfNum;
        if(lastNum) {
            endOfNum = mathString.length();
            operatorPosition = 0;
        } else {
            endOfNum = mathString.indexOf(operator);
            if(debug) {
                System.out.println("End of num by looking for operator " + operator);
            }

            /*
            if(endOfNum<1) {
                endOfNum = 1;
            }
             */

            operatorPosition = endOfNum+1;
        }
        if(debug) {
            System.out.println("OperatorPosition: " + operatorPosition);
            System.out.println("EndOfNum: " + endOfNum);
            System.out.println("LastNum: " + lastNum);
            System.out.println("Mathstring before substring: " + mathString);
        }
        String numString = mathString.substring(0, endOfNum);
        double num = Double.parseDouble(numString);
        mathString = mathString.substring(operatorPosition);
        if(debug) {
            System.out.println("NumString after substring " + numString);
            System.out.println("Mathstring after substring: " + mathString);
        }
        return num;
    }

    public void initAbstractMath() {
        mathList.put('+', new Addition());
        mathList.put('-', new Subtraction());
    }

    public static void main(String[] args) {
        new Rechner();
    }
}