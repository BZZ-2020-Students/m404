package beispiel;

/**
 * Die Klasse Kategorie beinhaltet eine Liste von Zitaten.
 * Also kann jede Kategorie mehrere Zitate in sich speichern.
 * Im Attribut „name“ wird der Name der Kategorie bestimmt.
 *
 * @author Kevin Maurizi
 * @version 0.9
 * @since 06.04.2020
 */

public class Kategorie {

    private String name;
    private int anzZitate;
    private final int MAX_ZITATE = 100;
    private Zitat[] zitate;


    /**
     * Konstruktor der Kategorie
     *
     * @param name Name der Kategorie
     */
    public Kategorie(String name) {
        this.name = name;
        zitate = new Zitat[MAX_ZITATE]; // Die Maximale anzahl Zitate ist 100 Stück
        anzZitate = 0;                  // beim Erstellen einer neuen Kategorie gibt es noch keine Zitate, also 0;
    }

    /**
     * Methode um ein Zitat hinzuzufügen.
     *
     * @param zitat ein Zitat das zur Liste hinzugefügt werden soll.
     */
    public void addZitat(Zitat zitat) {
        zitate[anzZitate] = zitat;
        anzZitate++;
    }

    /**
     * Methode um ein Zitat zu löschen.
     *
     * @param number Nummer des Zitat das gelöscht werden soll.
     */
    public void removeZitat(int number) {
        // IF: Fehlerbehandlung, wenn zu löschende Nummer zu gross oder zu klein;
        // ELSE: Löschen des Zitates aus dem Array
        if (number > anzZitate || number < 0) {
            System.out.println("Wert nicht gültig, bitte erneut eingeben.");
        } else {
            // BEGIN: Code für das löschen eines Eintrages aus einem Array
            Zitat[] zitateCopy = new Zitat[MAX_ZITATE];
            int anzZitateCopy = 0;
            for (int i = 0; i < anzZitate; i++) {
                if (i != number) {
                    zitateCopy[anzZitateCopy] = zitate[i];
                    anzZitateCopy++;
                }
            }
            zitate = zitateCopy;
            anzZitate = anzZitateCopy;
            // ENDE: Code für das löschen eines Eintrages aus einem Array
        }
    }

    /**
     * Methode um alle Zitate auszugeben mit dem Format:
     * "Nummer"     Text
     */
    public void showZitate() {
        if (anzZitate == 0) {
            System.out.println("Es sind keine Zitate erfasst.");
        } else {
            for (int i = 0; i < anzZitate; i++) {
                System.out.println("«" + i + "»\t" + zitate[i].getText());
            }
        }
    }

    /**
     * Getter für das Attribut name
     *
     * @return den Namen der Kategorie
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für das Attribut "name"
     *
     * @param name der Kategorie
     */
    public void setName(String name) {
        this.name = name;
    }
}
