package teacher.lesson_9_interfaces.lessoncode.boxexample;

import javax.swing.*;
import java.util.Random;

public class WarehouseServiceSlowImpl implements WarehouseService {

    Item[] items = new Item[10];

    private int findNextPosition() {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public boolean putIntoTheBox(Item item) {
        int index = findNextPosition();
        System.out.println("Putting item intro the box...slowly");
        items[index] = item;
        return true;
    }

    @Override
    public void sorting() {
        System.out.println("Slow sorting");
    }
}
