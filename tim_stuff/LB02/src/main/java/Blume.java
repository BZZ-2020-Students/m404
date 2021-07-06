public class Blume {
    private final int id;
    private final String name;
    private final double preis;
    private final String farbe;
    private final String urpsrungsland;

    public Blume(int id, String name, double preis, String farbe, String urpsrungsland) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.farbe = farbe;
        this.urpsrungsland = urpsrungsland;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getUrpsrungsland() {
        return urpsrungsland;
    }

    @Override
    public String toString() {
        return id + ". Blume: " + name + ", " + farbe + ", " + urpsrungsland + ", " + preis + "Fr.";
    }
}
