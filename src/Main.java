import flowers.Flower;

public class Main {

    static FlowerStore flowerStore = new FlowerStore();

    static void show(Flower[] bouquet) {
        for (int i = 0; i < bouquet.length; i++) {
            String[] flower = bouquet[i].getClass().getName().split("\\.");
            System.out.print(flower[1]);
            if (i < bouquet.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".\nPurse: " + flowerStore.getPurse());
            }
        }
    }

    public static void main(String[] args) {

        show(flowerStore.sell(2,3,2));
        show(flowerStore.sellSequence(5,7,3));

    }
}
