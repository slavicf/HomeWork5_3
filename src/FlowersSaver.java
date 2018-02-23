import flowers.Flower;

import java.io.FileWriter;
import java.io.IOException;

abstract class FlowersSaver {

    public static void save (String path, Flower[] bouquet) {
        String text = Main.formBouquet(bouquet);
        System.out.println(text);

        try {
            System.out.println("Trying write bouquet to " + path + "...");
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.flush();
            writer.close();
            System.out.println("File write successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File write failed");
        }


    }
}
