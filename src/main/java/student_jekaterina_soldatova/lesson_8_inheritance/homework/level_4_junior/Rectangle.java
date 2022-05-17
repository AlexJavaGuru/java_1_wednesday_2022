package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;


    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println(title + " sideA: " + sideA + "; sideB: " + sideB);
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }


}
