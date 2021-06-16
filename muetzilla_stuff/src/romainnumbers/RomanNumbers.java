package romainnumbers;


import scanner.Scan;

public class RomanNumbers {
    Scan scanner;
    String[] romainNumbers = {"I", "V", "X", "L", "C", "D", "M"};

    public RomanNumbers() {
        scanner = new Scan();
    }

    public static void main(String[] args) {
        RomanNumbers roNu = new RomanNumbers();
        roNu.run();
    }

    public void run() {
        int arabicNumberInput;
        do {
            System.out.print("Geben Sie einge ganze Zahl zwischen 1 und 9999 ein > ");
            arabicNumberInput = scanner.scanInt();
        } while (arabicNumberInput > 9999 || arabicNumberInput < 1);
        System.out.println("Die Zahl " + arabicNumberInput + " entspricht der römischen Zahl " + convertToRomanNumber(arabicNumberInput));
    }

    private String convertToRomanNumber(int arabicNumberInput) {
        StringBuilder romanNumber = new StringBuilder();
        for (int i = 0; i < arabicNumberInput; i++) {
            romanNumber.append("I");
            System.out.println(romainNumbers[i]);
        }
        return romanNumber.toString();
    }


}
