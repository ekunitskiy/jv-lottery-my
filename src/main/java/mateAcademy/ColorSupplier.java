package mateAcademy;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        //int index = new Random().nextInt(Colors.values().length);
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.toString();
    }
}