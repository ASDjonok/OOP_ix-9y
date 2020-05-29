package lab6;

public class Flower extends BouquetComponent {
    private int freshness;

    public Flower(int price, int freshness) {
        super(price);
        this.freshness = freshness;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "class=" + /*this.*/getClass().getSimpleName() +
                ", freshness=" + freshness +
                '}';
    }
}
