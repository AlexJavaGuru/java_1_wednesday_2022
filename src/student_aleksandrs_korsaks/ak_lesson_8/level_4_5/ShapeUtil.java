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
        double sumOfShapesAreas = 0;
        for (Shape shape : shapes) {
            sumOfShapesAreas = sumOfShapesAreas + shape.calculateArea();
        }
        return sumOfShapesAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumOfShapesPerimetrs = 0;
        for (Shape shape : shapes) {
            sumOfShapesPerimetrs = sumOfShapesPerimetrs + shape.calculatePerimeter();
        }
        return sumOfShapesPerimetrs;
    }
}
