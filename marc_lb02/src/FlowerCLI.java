import java.math.BigDecimal;

public class FlowerCLI {
    private final FlowerManagement fm;
    private final InputReader ir = new InputReader();

    public static void main(String[] args) {
        FlowerCLI cli = new FlowerCLI();
        cli.run();
    }

    public FlowerCLI() {
        fm = new FlowerManagement();
        fm.getFlowers()[0] = new Flower("Tulpe", BigDecimal.valueOf(2.5), "Gelb", "Holland");
        fm.getFlowers()[1] = new Flower("Narzisse", BigDecimal.valueOf(15.25), "Blau", "Peru");
    }

    private void run() {
        printWelcomeMessage();
        char input;
        loop:
        while (true) {
            printMenu();
            input = ir.readChar();
            switch (input) {
                case 'b' -> {
                    for (int i = 0; i < fm.getFlowers().length; i++) {
                        if  (fm.getFlowers()[i] == null) {
                            fm.getFlowers()[i] = getFlowerFromInput();
                            System.out.println("Die Blume wurde erfolgreich gespeichert.");
                            break;
                        }
                    }
                }

                case 'p' -> {
                    System.out.println("In der Blumenverwaltung sind folgende Blumen gespeichert:");
                    for (Flower f : fm.getFlowers()) {
                        if (f == null) break;
                        System.out.println(f);
                    }
                }

                case 'x' -> {
                    break loop;
                }
            }
        }
    }

    private void printWelcomeMessage() {
        System.out.println("Willkommen zur Blumenverwaltung.\n");
    }

    private void printMenu() {
        System.out.println("Drücken Sie \"b\" um eine Blume zu erstellen.");
        System.out.println("Drücken Sie \"p\" um alle Informationen auszudrucken");
        System.out.println("Drücken Sie \"x\" um das Programm zu beenden.");
    }

    private Flower getFlowerFromInput() {
        System.out.println("Wie heisst die Blume");
        String name = ir.readString();

        System.out.println("Was kostet die Blume");
        BigDecimal price = BigDecimal.valueOf(ir.readDouble());

        System.out.println("Welche Farbe hat die Blume");
        String color = ir.readString();

        System.out.println("Woher kommt die Blume");
        String origin = ir.readString();

        return new Flower(name, price, color, origin);
    }
}
