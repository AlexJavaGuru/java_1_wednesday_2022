package student_aleksandr_zuk.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> demo = new ArrayList<>();
        demo.add(1);
        demo.add(10);
        demo.add(100);
        demo.add(100);
        demo.add(100);
        demo.add(1000);
        demo.add(demo.size(), 10);
        demo.add(0, 100);
        System.out.println(demo);

        demo.remove(3);
        demo.remove("10");
        System.out.println(demo);

        boolean isEmpty = demo.isEmpty();
        System.out.println(demo);

        for (Integer integer : demo) {
            System.out.println(integer);
        }

    }


}
