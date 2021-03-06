package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle("circle", randomDouble());
    };

    Square createRandomSquare() {
        return new Square("square", (int)(randomDouble()));
    }

    Rectangle createRandomRectangle(){
        return new Rectangle("rectangle", randomDouble(), randomDouble());
    }

    Triangle createRandomTriangle() {
        return new Triangle("triangle", (randomDouble()));
    }

    double randomDouble() {
        return Math.random()* 10.0 + 1.0;
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
        double result = 0.0;
        for (Shape shape: shapes) {
            result += calculateArea(shape);
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes) {
        double result = 0.0;
        for (Shape shape: shapes) {
            result += calculatePerimeter(shape);
        }
        return result;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
