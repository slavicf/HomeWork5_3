import flowers.Flower;

public class Main {

    static FlowerStore flowerStore = new FlowerStore();
    static String path1 = "files/order.txt";
    static String path2 = "files/bouquet.txt";

    public static String formBouquet(Flower[] bouquet) {
        String buffer = "";
        for (int i = 0; i < bouquet.length; i++) {
            String[] flower = bouquet[i].getClass().getName().split("\\.");
            buffer += flower[1];
            if (i < bouquet.length - 1) {
                buffer += ", ";
            } else {
                buffer += ".";
            }
        }
        return buffer;
    }

    static void show(Flower[] bouquet) {
        System.out.println(formBouquet(bouquet));
        System.out.println("Purse: " + flowerStore.getPurse());
    }

    public static void main(String[] args) {

        System.out.println("\nSell:");
        show(flowerStore.sell(2, 3, 2));

        System.out.println("\nSell sequence:");
        show(flowerStore.sellSequence(5, 7, 3));

        System.out.println("\nRead file:");
        show(FlowersLoader.load(path1));

        System.out.println("\nWrite file:");
        FlowersSaver.save(path2, flowerStore.sellSequence(7, 9, 5));

    }
}
