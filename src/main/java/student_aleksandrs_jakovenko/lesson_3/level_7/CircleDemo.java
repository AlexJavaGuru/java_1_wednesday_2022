package student_aleksandrs_jakovenko.lesson_3.level_7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        double result = circle.calculateArea();
        System.out.println("Circle area = " + result);
    }
}