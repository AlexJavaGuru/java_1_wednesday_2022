package student_aleksandrs_korsaks.ak_lesson_10.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TaskFour {
    public static void main(String[] args) {
        List<Integer> demoArray = new ArrayList<>();
        List<Integer> demoLinked = new LinkedList<>();

        demoArray.add(1);
        demoArray.add(null);
        demoArray.add(null);
        demoArray.add(1);
        System.out.println(demoArray);

        demoLinked.add(1);
        demoLinked.add(null);
        demoLinked.add(null);
        demoLinked.add(1);
        System.out.println(demoLinked);
    }
}
