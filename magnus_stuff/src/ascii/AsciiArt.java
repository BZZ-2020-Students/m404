package ascii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Function to change String into AsciiArt
 *
 * @author Magnus Götz
 * @version 0.1
 * @since 2021.06.08
 */
public class AsciiArt {

    public static void main(String[] args) {
        AsciiArt programm = new AsciiArt();
        programm.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Was willst du schreiben > ");
        String sentence = scanner.nextLine();
        String[] sentenceChar = sentence.split("");
        String[] ascii = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : sentenceChar) {
            for (int i = 0; i < ascii.length; i++) {
                if (s.equalsIgnoreCase(ascii[i])) numbers.add(i);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j : numbers) {
                System.out.print(ArtText.letters[j][i]);
            }
            System.out.println();
        }

    }
}
