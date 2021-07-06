import java.util.ArrayList;

public class BlumenVerwaltung {
    private final int maxBlumen;
    private ArrayList<Blume> blumen = new ArrayList<>();
    private Einleser scanner = new Einleser();

    public BlumenVerwaltung(int maxBlumen) {
        this.maxBlumen = maxBlumen;
        run();
    }

    private void run() {
        boolean exit = false;
        while(!exit) {
            System.out.println(getMenu());
            System.out.print("> ");
            char c = scanner.readChar();
            Command command = Command.getByShortcut(c);
            while(command == null) {
                System.out.println("Geben Sie einen der angegebenen Buchstaben an!");
                System.out.print("> ");
                c = scanner.readChar();
                command = Command.getByShortcut(c);
            }
        }
    }

    private String getMenu() {
        StringBuilder menu = new StringBuilder();
        for(Command command : Command.getValues()) {
            menu.append(command.getDescription()).append("\n");
        }
        return menu.toString();
    }

    public int getMaxBlumen() {
        return maxBlumen;
    }

    public ArrayList<Blume> getBlumen() {
        return blumen;
    }

    public void setBlumen(ArrayList<Blume> blumen) {
        this.blumen = blumen;
    }
}
