package student_aleksandrs_jakovenko.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryError {

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        for (int i = 1; i > 0; i++)
            test.add(i);
    }
}