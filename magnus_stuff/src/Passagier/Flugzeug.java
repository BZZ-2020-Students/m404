package Passagier;

public class Flugzeug {
    private String name;
    private Passagier[][] passagiers;

    public Flugzeug() {
    }

    public Flugzeug(String name, Passagier[][] passagiers) {
        this.name = name;
        this.passagiers = passagiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passagier[][] getPassagiers() {
        return passagiers;
    }

    public void setPassagiers(Passagier[][] passagiers) {
        this.passagiers = passagiers;
    }
}
