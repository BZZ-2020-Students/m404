import java.math.BigDecimal;

public class Flower {
    private String name;
    private BigDecimal price;
    private String color;
    private String origin;

    public Flower(String name, BigDecimal price, String color, String origin) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.origin = origin;
    }

    public Flower() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + origin + ", " + price + "Fr.";
    }
}
