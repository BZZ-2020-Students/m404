package asciiart;

import scanner.InputReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class AsciiArt {
    public static void main(String[] args) {
        new AsciiArt().run();
    }

    private void run() {
        InputReader ir = new InputReader();
        System.out.print("Enter the text you want in asciiart > ");
        String input = ir.readString();

        try {
            saveFile(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile(String input) throws IOException {
        FileWriter fw = new FileWriter(input + ".txt");
        input = input.toLowerCase(Locale.ROOT);

        for (int i = 0; i < 6; i++) {
            for (char c : input.toCharArray()) {
                if (c < 97 || c > 97 + 25) continue;
                int chr = c - 97;
                fw.append(ArtText.letters[chr][i]);
            }
            fw.write(System.lineSeparator());
        }

        fw.close();
    }
}
