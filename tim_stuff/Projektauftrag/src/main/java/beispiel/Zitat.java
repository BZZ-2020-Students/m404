package beispiel;

/**
 * Die Klasse Zitat beinhaltet lediglich den Text, welcher zu diesem Zitat gehört.
 * Dieses Zitat wird dann in der jeweiligen Kategorie, in welche es gehört, gespeichert.
 *
 * @author Kevin Maurizi
 * @version 0.9
 * @since 06.04.2020
 */

public class Zitat {
    private String text;

    /**
     * Konstruktor für ein Zitat.
     * @param text Text welcher in dieses Zitat gehört
     */
    public Zitat(String text){
        this.text = text;
    }

    /**
     * Getter für das Attribut "text"
     * @return den Text, der in das Zitat gehört
     */
    public String getText() {
        return text;
    }

    /**
     * Setter für das Attribut "text"
     * @param text Text welcher in dieses Zitat gehört
     */
    public void setText(String text) {
        this.text = text;
    }
}
