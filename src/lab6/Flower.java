package lab6;

import java.util.Objects;

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

    // todo fix price
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return freshness == flower.freshness;
    }

    // todo read by your self:)
    @Override
    public int hashCode() {
        return Objects.hash(freshness);
    }
}
