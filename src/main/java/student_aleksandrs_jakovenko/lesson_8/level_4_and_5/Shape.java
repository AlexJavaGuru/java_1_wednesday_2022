package student_aleksandrs_jakovenko.lesson_8.level_4_and_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
