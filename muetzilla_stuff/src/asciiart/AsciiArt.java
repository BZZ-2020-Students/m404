package asciiart;

import scanner.Scan;

import java.util.Locale;

/**
 * Template Klasse für simple Java-Programme
 *
 * @author Ibi dumm
 * @version 0.1
 * @since 2021.06.08
 */
public class AsciiArt {

    public static void main(String[] args) {
        AsciiArt asc = new AsciiArt();
        asc.run();
    }

    private void run() {
        Scan scanner = new Scan();
        System.out.print("Was möchten Sie in Ascii Art dargestellt haben (Eingabe in Kleinbuchstaben und ohne Sonderzeichen sowie Leerzeichen) > ");
        String input = scanner.scanString();
        input.toLowerCase(Locale.ROOT);
        for (int i = 0; i < 6; i++) {
            for (char c : input.toCharArray()) {
                int charInInt = c;
                System.out.print(ArtText.letters[charInInt - 97][i]);
            }
            System.out.println();
        }
    }


}
