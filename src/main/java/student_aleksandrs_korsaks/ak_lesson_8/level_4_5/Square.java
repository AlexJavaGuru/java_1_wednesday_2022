package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round((Math.pow(side, 2)) * 100.00) / 100.00;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((4 * side) * 100.00) / 100.00;
    }
}
