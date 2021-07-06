public class Blume {
    private final String name;
    private final double preis;
    private final String farbe;
    private final String urpsrungslang;

    public Blume(String name, double preis, String farbe, String urpsrungslang) {
        this.name = name;
        this.preis = preis;
        this.farbe = farbe;
        this.urpsrungslang = urpsrungslang;
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

    public String getUrpsrungslang() {
        return urpsrungslang;
    }

    @Override
    public String toString() {
        return "Blume{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", farbe='" + farbe + '\'' +
                ", urpsrungslang='" + urpsrungslang + '\'' +
                '}';
    }
}
