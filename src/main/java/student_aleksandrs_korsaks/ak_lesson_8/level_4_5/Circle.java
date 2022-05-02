package student_aleksandrs_korsaks.ak_lesson_8.level_4_5;

class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.round((Math.PI * Math.pow(radius, 2)) * 100.00) / 100.00;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((2 * Math.PI * radius) * 100.00) / 100.00;
    }
}