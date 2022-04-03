package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextDouble(10));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Random square", random.nextDouble(10));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Random rectangle", random.nextDouble(10), random.nextDouble(10));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Random triangle", random.nextDouble(10));
    }
}
