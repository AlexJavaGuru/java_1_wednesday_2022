package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

import static java.lang.Math.sqrt;

class Triangle extends Shape {

    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
        System.out.println(title + " side: " + side);

    }

    @Override
    double calculateArea() {
        return (sqrt(3) / 4) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }


}
