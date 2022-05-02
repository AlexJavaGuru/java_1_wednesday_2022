package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class Triangle extends Shape {
    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round(((Math.pow(side, 2) * Math.sqrt(3)) / 4) * 100.00) / 100.00;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((side * 3) * 100.00) / 100.00;
    }
}
