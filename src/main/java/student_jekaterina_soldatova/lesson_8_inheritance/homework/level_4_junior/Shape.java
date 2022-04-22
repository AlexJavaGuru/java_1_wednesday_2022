package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
