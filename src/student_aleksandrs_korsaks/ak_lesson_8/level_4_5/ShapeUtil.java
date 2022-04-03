package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextDouble(10));
    }
}
