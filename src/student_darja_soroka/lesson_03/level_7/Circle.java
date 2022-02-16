package student_darja_soroka.lesson_03.level_7;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
