package teacher.lesson_9_interfaces.lessoncode.boxexample;

import org.w3c.dom.css.Counter;

import java.util.Random;

public class WarehouseServiceFastImpl implements WarehouseService {

    Item[] items = new Item[10];

    private int findNextPosition() {
        Random random = new Random();
        return random.nextInt(10);
    }

    @Override
    public boolean putIntoTheBox(Item item) {
        int index = findNextPosition();
        System.out.println("Add item into the box quickly");
        items[index] = item;
        return true;
    }

}
