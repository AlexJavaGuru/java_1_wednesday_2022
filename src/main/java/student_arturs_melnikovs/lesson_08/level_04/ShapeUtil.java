package student_arturs_melnikovs.lesson_08.level_04;

import java.util.Random;

class ShapeUtil {

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

    double calculateCombinedArea(Shape[] shapes) {
        double combinedArea = 0;
        for (Shape shape : shapes) {
            combinedArea += shape.calculateArea();
        }
        return combinedArea;
    }

    double calculateCombinedPerimeter(Shape[] shapes) {
        double combinedPerimeter = 0;
        for (Shape shape : shapes) {
            combinedPerimeter += shape.calculatePerimeter();
        }
        return combinedPerimeter;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Random circle", random.nextInt(10));
    }
    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Random square", random.nextInt(10));
    }
    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Random rectangle", random.nextInt(10), random.nextInt(10));
    }
    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Random triangle", random.nextInt(10));
    }


}
