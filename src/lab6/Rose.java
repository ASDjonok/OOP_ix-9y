package lab6;

public class Rose extends Flower {
    private int thornsQuantity;

    public Rose(int thornsQuantity, int price, int freshness) {
        super(price, freshness);
        this.thornsQuantity = thornsQuantity;
    }
}
