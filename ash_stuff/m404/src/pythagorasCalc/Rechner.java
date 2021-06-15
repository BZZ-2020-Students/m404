package pythagorasCalc;



public class Rechner {
    public static void main(String[] args) {
        new Rechner().run();
    }

    public void run(){
        pythEinleser e = new pythEinleser();
        Pythagoras pyth = new Pythagoras();
        String inputA;
        String inputB;
        String inputC;
        boolean correct = false;

        while(!correct) {
            System.out.println();
            System.out.println("---------------Pythagoras Calculator---------------");
            System.out.println("Enter a \"?\" for the side in question!");
            System.out.println();
            inputA = e.readString("a = ");
            inputB = e.readString("b = ");
            inputC = e.readString("c = ");

            if (inputA.equals("?")) {
                double result = pyth.sideA(inputB, inputC);
                System.out.println("Side a is " + result);
                correct = true;
            } else if (inputB.equals("?")) {
                double result = pyth.sideB(inputA, inputC);
                System.out.println("Side b is " + result);
                correct = true;
            } else if (inputC.equals("?")) {
                double result = pyth.sideC(inputA, inputB);
                System.out.println("Side c is " + result);
                correct = true;
            } else {
                System.out.println("Error! Enter proper values next time!");
            }
        }
    }
}
