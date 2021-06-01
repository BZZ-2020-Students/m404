package Taschenrechner;

import Taschenrechner.Math.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Rechner {
    private HashMap<Character, AbstractMath> mathList = new HashMap();
    Einleser scanner = new Einleser();
    boolean debug = false;

    public Rechner() {
        run();
    }

    public void run() {
        initAbstractMath();

        System.out.print("Debug aktivieren? >");
        debug = scanner.readBoolean();
        System.out.print("Geben sie bitte ihre Rechnung ein > ");
        System.out.println("Resultat = " + mathInterpreter(scanner.readString()));
        // System.out.println(mathInterpreter("123+456-78.9+1111"));
    }

    public double mathInterpreter(String mathString) {
        mathString = mathString.replaceAll(" ", "");
        ArrayList<NumberPair> numberMathPairs = new ArrayList<>();

        NumberPair currentNumberPair = new NumberPair();
        int index = 0;
        for(char c : mathString.toCharArray())  {
            if(Character.isDigit(c) || c == '.' || c == ',') {
                currentNumberPair.addToNumber(index, c);
                if(debug) System.out.println("Number: " + currentNumberPair.getNumberString(index));
            } else if(mathList.containsKey(c)) {
                if(currentNumberPair.getAbstractMath() == null) {
                    if(debug) System.out.println("No current operator, setting one...");
                    currentNumberPair.setAbstractMath(mathList.get(c));
                    currentNumberPair.setOperator(c);
                    if(debug) System.out.println("Set operator to " + c);
                    index=1;
                } else {
                    if(debug) System.out.println("Already set operator, creating new currentNumberPair");
                    numberMathPairs.add(currentNumberPair);
                    currentNumberPair = new NumberPair();
                    currentNumberPair.setAbstractMath(mathList.get(c));
                    currentNumberPair.setOperator(c);
                    if(debug) System.out.println("new current num pair");
                }
            } else {
                System.out.println("Unknown operator! skipping...");
            }
        }
        numberMathPairs.add(currentNumberPair);

        if(debug) {
            for (NumberPair pair : numberMathPairs) {
                System.out.println(pair);
            }
        }

        double zwischenResultat = 0.0;
        for(NumberPair pair : numberMathPairs) {
            double num1;
            double num2;

            if(pair.getNumberString(0).equals("")) {
                // If the first number is empty
                num1 = zwischenResultat;
            } else {
                num1 = pair.getNumber(0);
            }
            if(!pair.getNumberString(1).equals("")) {
                num2 = pair.getNumber(1);

                zwischenResultat = pair.getAbstractMath().calculate(num1,num2);
                System.out.println("" + num1 + pair.getOperator() + num2 + "=" + zwischenResultat);
            } else {
                zwischenResultat = num1;
            }
        }

        return zwischenResultat;
    }
    public void initAbstractMath() {
        mathList.put('+', new Addition());
        mathList.put('-', new Subtraction());
        mathList.put('*', new Multiplication());
        mathList.put('/', new Fraction());
    }

    public static void main(String[] args) {
        new Rechner();
    }
}