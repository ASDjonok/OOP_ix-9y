package lab6;

public class Main {
    public static void main(String[] args) {

        Flower flower = new Rose(1, 30, 2);

        Flower flower2 = new Chamomile(5, 1);

        Tape tape = new Tape(1);

        String s = "A";

        Bouquet bouquet = new Bouquet(new BouquetComponent[]{flower, flower2, tape});

        bouquet.sortByFreshness();

        System.out.println("Done!");
    }
}
