
import flowers.Flower;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class FlowersLoader {

    public static Flower[] load (String path) {
        int rose = 0;
        int chamomile = 0;
        int tulip = 0;
        FlowerStore flowerStore = new FlowerStore();

        try {
            FileInputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            rose = scanner.nextInt();
            chamomile = scanner.nextInt();
            tulip = scanner.nextInt();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return flowerStore.sell(rose, chamomile, tulip);
    }
}
