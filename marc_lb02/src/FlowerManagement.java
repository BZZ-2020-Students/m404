public class FlowerManagement {
    private Flower[] flowers = new Flower[500];

    public FlowerManagement() {
    }

    public FlowerManagement(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }
}
