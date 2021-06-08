/**
 * Template Klasse für simple Java-Programme
 *
 * @author Ibi dumm
 * @since 2021.06.08
 * @version 0.1
 */
public class AsciiArt {

    public static void main(String[] args) {
        AsciiArt programm = new AsciiArt();
        programm.run();
    }

    private void run() {
        // TODO: Implement logic
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.println(ArtText.letters[j][i]);
            }
        }

    }
}
