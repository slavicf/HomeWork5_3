import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

public class FlowerStore {

    private int i, index;
    private double purse = 0;
    private Flower[] bouquet;

    public double getPurse() {
        return purse;
    }

    private void addFlower(Flower flower) {
        bouquet[index++] = flower;
        purse += flower.getPrice();
    }

    public Flower[] sell(int rose, int chamomile, int tulip) {
        index = 0;
        bouquet = new Flower[rose + chamomile + tulip];

        for (i = 0; i < rose; i++) addFlower(new Rose());
        for (i = 0; i < chamomile; i++) addFlower(new Chamomile());
        for (i = 0; i < tulip; i++) addFlower(new Tulip());

        return bouquet;
    }

    public Flower[] sellSequence(int rose, int chamomile, int tulip) {
        index = 0;
        bouquet = new Flower[rose + chamomile + tulip];

        while (rose > 0 || chamomile > 0 || tulip >0) {
            if (rose-- > 0) addFlower(new Rose());
            if (chamomile-- > 0) addFlower(new Chamomile());
            if (tulip-- > 0) addFlower(new Tulip());
        }

        return bouquet;
    }

}
