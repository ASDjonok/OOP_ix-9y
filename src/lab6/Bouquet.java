package lab6;

import java.util.*;

public class Bouquet {
    private BouquetComponent[] bouquetComponents;

    public Bouquet(BouquetComponent[] bouquetComponents) {
        this.bouquetComponents = bouquetComponents;
    }

    public void sortByFreshness() {
        List<Flower> flowersList = new ArrayList();
        for (BouquetComponent bouquetComponent : bouquetComponents) {
            if (bouquetComponent instanceof Flower) {
                flowersList.add((Flower) bouquetComponent);
            }
        }
        flowersList.sort(Comparator.comparing(Flower::getFreshness));
        System.out.println(flowersList);
    }
}
