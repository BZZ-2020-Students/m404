public enum Command {
    CREATE_FLOWER('b', "Drücken Sie \"%\" um eine Blume zu erstellen"),
    PRINT_INFOS('p', "Drücken Sie \"%\" um alle Informationen auszudrucken"),
    EXIT('x', "Drücken Sie \"%\" um das Programm zu beenden");


    private static final Command[] values = values();
    private final char shortcut;
    private final String description;

    Command(char shortcut, String description) {
        this.shortcut = shortcut;
        this.description = description.replace('%', shortcut);
    }

    public static Command getByShortcut(char c) {
        for (Command command : Command.getValues()) {
            if (command.shortcut == c) {
                return command;
            }
        }
        return null;
    }

    public char getShortcut() {
        return shortcut;
    }

    public static Command[] getValues() {
        return values;
    }

    public String getDescription() {
        return description;
    }
}
