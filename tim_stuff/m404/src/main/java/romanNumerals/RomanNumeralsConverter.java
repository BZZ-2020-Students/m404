package romanNumerals;

public class RomanNumeralsConverter {
    Einleser scanner = new Einleser();

    public RomanNumeralsConverter() {
        run();
    }

    private void run() {
        System.out.print("Bitte ihre Zahl eingeben > ");
        int number = scanner.readInt();
        while (number > 9999 || number < 1) {
            System.out.println("Die Zahl muss zwischen 1 und 9999 liegen!");
            System.out.print("Bitte ihre Zahl eingeben > ");
            number = scanner.readInt();
        }

        int startNumber = number;
        StringBuilder romanNumberString = new StringBuilder();
        while (number > 0) {
            for (RomanNumerals romanNumeral : RomanNumerals.values()) {
                if (number >= romanNumeral.getValue()) {
//                    System.out.println("Current Numeral: " + romanNumeral + "\nnumber before: " + number);
                    number -= romanNumeral.getValue();
//                    System.out.println("Number after: " + number);
                    romanNumberString.append(romanNumeral);
                    break;
                }
            }
        }

        System.out.println(startNumber + " = " + romanNumberString);
    }

    public static void main(String[] args) {
        new RomanNumeralsConverter();
    }
}