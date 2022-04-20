package student_aleksandrs_jakovenko.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> demo = new ArrayList<>();
        demo.add(5);
        demo.add(55);
        demo.add(555);
        demo.add(555);
        demo.add(555);
        demo.add(5555);
        demo.add(demo.size(), 10); //last
        demo.add(0, 100); //first
        System.out.println(demo);

        demo.remove(3);
        demo.remove("55");
        System.out.println(demo);

        boolean isEmpty = demo.isEmpty();
        System.out.println(demo);

        for (Integer integer : demo) {
            System.out.println(integer);
        }
    }
}
