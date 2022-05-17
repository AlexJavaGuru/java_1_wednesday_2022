package student_arturs_melnikovs.lesson_10.level_01;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(0, 10);
        integers.add(15);
        integers.add(20);
        System.out.println(integers.size());
        System.out.println(integers);
        integers.remove((Object) 20);
        System.out.println(integers);
        integers.remove(0);
        System.out.println(integers);
        System.out.println(integers.isEmpty());
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
