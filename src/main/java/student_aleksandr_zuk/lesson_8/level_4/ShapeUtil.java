package student_aleksandr_zuk.lesson_8.level_4;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextInt(3));

    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Random square", random.nextInt(3));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Random rectangle", random.nextInt(3), random.nextInt(5));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Random triangle", random.nextInt(3));
    }

    Shape createRandomShape() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
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

        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;

    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;

        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;

    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}


