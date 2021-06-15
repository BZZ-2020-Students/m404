package roman;

import scanner.InputReader;

public class RomanNumbers {
    public static void main(String[] args) {
        new RomanNumbers().run();
    }

    private void run() {
        InputReader ir = new InputReader();
        int inp = 0;
        while ( inp >= 0) {
            System.out.print("Please enter a number between 0 and 4000 > ");
            inp = ir.readInt();

            if (inp < 1 || inp > 3999) continue;
            convert(inp);
        }
    }

    String convert(int nr) {
        StringBuilder roman = new StringBuilder();
        String numberStr = "" + nr;

        for (int i = 0; i < numberStr.length(); i++) {
            roman.append(convertNumber(Integer.parseInt("" + numberStr.charAt(i) + "0".repeat(Math.max(0, numberStr.length() - 1 - i)))));
        }

        System.out.println("Final Result ... " + roman);

        return roman.toString();
    }

    String convertNumber(int nr) {
        StringBuilder numeral = new StringBuilder();
        System.out.println("\n\nNow converting... " + nr);

        int tempNr = nr;
        for (RomanLetter l : RomanLetter.values()) {
            while (tempNr - l.getValue() >= 0) {
                tempNr -= l.getValue();
                numeral.append(l.name());
                System.out.println(nr + " currently " + numeral);
                checkForAbbr(numeral, l);
            }
        }

        System.out.println("Converted _" + nr + " to " + numeral);

        return numeral.toString();
    }

    private void checkForAbbr(StringBuilder roman, RomanLetter l) {
        String check = (roman.length() >= 4) ? roman.substring(roman.length() - 4) : "";
        if (check.equals(l.name().repeat(4))) { // replace for ex. IIII with IV
            roman.replace(roman.length() - 4, roman.length(), l.name() + l.getPrevious().name());
            System.out.println("replaced _" + check + " with" + l.name() + l.getPrevious().name());
        }

        check = (roman.length() >= 3) ? roman.substring(roman.length() - 3) : "";
        if (l.ordinal() <= 1) return;
        if (check.equals(l.getPrevious().name() + l.name() + l.getPrevious().name())) { // replace for ex. VIV with IX
            String prev = l.name() + l.getPrevious().getPrevious().name();
            roman.replace(roman.length() - 3, roman.length(), l.name() + prev);
            System.out.println("replaced _" + check + " with" + l.name() + prev);
        }
    }
}
