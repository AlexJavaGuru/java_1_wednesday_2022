package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
        System.out.println(title + " side: " + side);

    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }


}
