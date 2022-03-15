package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextInt(5));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Random square", random.nextInt(5));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Random rectangle", random.nextInt(5), random.nextInt(10));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Random triangle", random.nextInt(5));
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;

        return area;
    }
}
