package student_arturs_melnikovs.lesson_03.level_07;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
