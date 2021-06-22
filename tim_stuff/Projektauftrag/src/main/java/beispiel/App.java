package beispiel;

/**
 * Die Klasse App verwaltet die Sammlung von Zitaten.
 * Und verwaltet die Kommunikation mit dem User.
 * Die Klasse App verwendet auch die Klasse Einleser.java, welche die Eingaben auf der Konsole verwaltet.
 *
 * @author Kevin Maurizi
 * @version 0.9
 * @since 06.04.2020
 */

public class App {

    Sammlung sammlung;
    Einleser einleser;

    /**
     * Konstruktor für die App
     * Hier werden die globalen Objekte erstellt und die Sammlung wird initial befüllt.
     */
    public App() {
        sammlung = new Sammlung();
        einleser = new Einleser();
        initSammlung();
    }

    /**
     * Main-Methode, die das Programm startet.
     * @param args optionale Übergabeparameter, werden nicht genutzt.
     */
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    /**
     * Hauptmethode, hier wird der Benutzerdialog gesteuert.
     */
    public void run() {
        Einleser einleser = new Einleser();

        char menueAuswahl = ' ';

        while (menueAuswahl != 'x') {
            begruessen();
            menueAuswahl = einleser.readChar();
            if (menueAuswahl == 'a') {
                auswahlAnzeigen();
            } else if (menueAuswahl == 'e') {
                auswahlZitatErstellen();
            } else if (menueAuswahl == 'k') {
                auswahlKategorieErstellen();
            } else if (menueAuswahl == 'l') {
                auswahlLoeschen();
            } else {
                System.out.println("Befehl nicht erkannt, bitte erneut eingeben:");
            }

            einleser.drawLine();
            System.out.println("Drücken Sie «h» um zum Hauptmenue zurück zu gelangen.");
            System.out.println("Drücken Sie «x» um das Programm zu beenden.");
            menueAuswahl = einleser.readChar();
        }
        System.out.println("Der Abschied von einer langen und wichtigen Arbeit ist immer mehr traurig als " +
                "erfreulich.");
        einleser.drawLine();
    }

    /**
     * Beinhaltet die Logik für das Anzeigen der Zitate
     */
    private void auswahlAnzeigen() {
        System.out.println("Welche Kategorie von Zitaten möchten Sie anzeigen,\n" +
                "selektieren Sie die Kategorie mittels Auswahl der Zahl:");

        sammlung.showKategorien();
        Kategorie kategorie = sammlung.getKategorie(einleser.readInt());

        System.out.println("Sie haben die Kategorie " + kategorie.getName() + " gewählt, \n" +
                "jetzt sehen Sie alle Zitate dieser Kategorie");

        einleser.drawLine();
        kategorie.showZitate();
    }

    /**
     * Beinhaltet die Logik für das Erstellen von Kategorien
     */
    private void auswahlKategorieErstellen() {
        System.out.println("Welche Kategorie möchten Sie neu erfassen?");

        String name = einleser.readString();
        Kategorie newKategorie = new Kategorie(name);

        sammlung.addKategorie(newKategorie);

        System.out.println("Sie haben die Kategorie " + newKategorie.getName() + " neu erfasst.");
    }

    /**
     * Beinhaltet die Logik für das Erstellen von Zitaten
     */
    private void auswahlZitatErstellen() {
        System.out.println("Für welche Kategorie von Zitaten möchten Sie ein neues Zitat erfassen?\n" +
                "Selektieren Sie die Kategorie mittels Auswahl der Zahl:");

        sammlung.showKategorien();
        Kategorie kategorie = sammlung.getKategorie(einleser.readInt());

        System.out.println("Sie haben die Kategorie " + kategorie.getName() + " gewählt, \n" +
                "geben Sie nun ein neues Zitat ein:");

        String text = einleser.readString();
        kategorie.addZitat(new Zitat(text));

        System.out.println("Das Zitat wurde gespeichert.");
    }

    /**
     * Beinhaltet die Logik für das Löschen von Kategorien und Zitaten.
     */
    private void auswahlLoeschen() {
        System.out.println("Was möchten Sie löschen, wählen Sie:\n" +
                "«k»\tfür Kategorie\n" +
                "«z»\tfür Zitat");

        char eingabeLoeschen = einleser.readChar();

        if (eingabeLoeschen == 'k') {

            System.out.println("Welche Kategorie möchten Sie löschen?\n" +
                    "Selektieren Sie die Kategorie mittels Auswahl der Zahl:\n");
            sammlung.showKategorien();
            int zuLoeschen = einleser.readInt();
            System.out.println("Kategorie «" + sammlung.getKategorie(zuLoeschen).getName() + "» inklusive Zitate der Kategorie wurden gelöscht. ");
            sammlung.removeKategorie(zuLoeschen);

        } else if (eingabeLoeschen == 'z') {
            System.out.println("In welcher Kategorie ist das Zitat, dass Sie löschen möchten?\n" +
                    "Selektieren Sie die Kategorie mittels Auswahl der Zahl:");
            sammlung.showKategorien();
            Kategorie kategorie = sammlung.getKategorie(einleser.readInt());
            System.out.println("Welches der Zitate der Kategorie «" + kategorie.getName() + "» möchten Sie löschen?");
            kategorie.showZitate();
            kategorie.removeZitat(einleser.readInt());
            System.out.println("Das Zitat wurde gelöscht.");

        } else {
            System.out.println("Befehl nicht erkannt, bitte erneut eingeben:");
        }
    }

    /**
     * Begrüsst den User und Zeichnet das Menue.
     */
    private void begruessen() {
        String ausgabe = "Willkommen zum Zitat-Lexikon\n";
        ausgabe += "Was möchten Sie machen, wählen Sie:\n\n";
        ausgabe += "«a» für Anzeigen von Zitaten\n";
        ausgabe += "«e» für das Erfassen eines neuen Zitates\n";
        ausgabe += "«k» für das Erfassen einer neuen Kategorie\n";
        ausgabe += "«l» für das Löschen einer Kategorie oder eines Zitates";
        System.out.println(ausgabe);
    }

    /**
     * Befüllt die Sammlung initial mir Werten.
     */
    private void initSammlung() {

        Kategorie kat1 = new Kategorie("Geburt");
        kat1.addZitat(new Zitat("Geboren zu werden heisst, zu sterben anfangen."));
        kat1.addZitat(new Zitat("Für die ganze Welt bist du nur irgendjemand.\n\t" +
                "Aber für irgendjemand bist du die ganze Welt."));

        Kategorie kat2 = new Kategorie("Geburtstag");
        kat2.addZitat(new Zitat("Mit dem Alter ist es wie mit dem Wein. Es muss ein guter Jahrgang sein!"));
        kat2.addZitat(new Zitat("Möge auf Schritt und Tritt, durch dick und dünn und über Stock und Stein das " +
                "Glück dein ständiger Begleiter sein!"));
        kat2.addZitat(new Zitat("Mann soll die Feste feiern wie sie fallen."));

        Kategorie kat3 = new Kategorie("Liebe");
        kat3.addZitat(new Zitat("Ohne Achtung gibt es keine wahre Liebe."));
        kat3.addZitat(new Zitat("Liebe ist die Kraft, die die Sonne bewegt und alle anderen Sterne."));
        kat3.addZitat(new Zitat("Was du liebst, lass frei. Kommt es zurück, gehört es dir - für immer."));

        Kategorie kat4 = new Kategorie("Arbeit");
        kat4.addZitat(new Zitat("Sommer ist die Zeit, in der es zu heiss ist, um das zu tun, " +
                "wozu es im Winter zu kalt war."));
        kat4.addZitat(new Zitat("Erfolg hat nur, wer etwas tut, während er darauf wartet."));

        sammlung.addKategorie(kat1);
        sammlung.addKategorie(kat2);
        sammlung.addKategorie(kat3);
        sammlung.addKategorie(kat4);
    }


}
