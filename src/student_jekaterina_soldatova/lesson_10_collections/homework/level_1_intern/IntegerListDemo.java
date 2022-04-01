package student_jekaterina_soldatova.lesson_10_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            listOfNumbers.add(i, i+1);
        }
        System.out.println(listOfNumbers.size());

        listOfNumbers.add(0, 0);
        listOfNumbers.add(listOfNumbers.size(), 25);

        listOfNumbers.remove(4);
        listOfNumbers.remove(Integer.valueOf(5));

        System.out.println(listOfNumbers.isEmpty());

        int i = 0;
        for (int item: listOfNumbers) {
            System.out.println("index " + i + ": " + item);
            i++;
        }


    }
}
