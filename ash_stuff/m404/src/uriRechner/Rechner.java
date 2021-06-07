package uriRechner;

import calculator.Einleser;

public class Rechner {
    public static void main(String[] args) {
        new Rechner().run();
    }

    public void run(){
        Einleser e = new Einleser();
        URI uri = new URI();
        String inputU;
        String inputI;
        String inputR;

        System.out.println("---------------URI Calculator---------------");
        System.out.println("Enter a \"?\" for the value in question!");
        System.out.println();
        inputU = e.readString("U = ");
        inputR = e.readString("R = ");
        inputI = e.readString("I = ");

        if(inputU.equals("?")){
            double result = uri.calcU(inputR, inputI);
            System.out.println("The result for U is " + result);
        }else if(inputI.equals("?")){
            double result = uri.calcI(inputU, inputR);
            System.out.println("The result for I is " + result);
        }else if(inputR.equals("?")){
            double result = uri.calcR(inputU, inputI);
            System.out.println("The result for R is " + result);
        }else{
            System.out.println("Error! Enter proper values next time!");
        }
    }
}
