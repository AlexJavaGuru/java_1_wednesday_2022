package student_aleksandrs_jakovenko.lesson_3.level_7;
// Task 30
class Circle {
    double radius;

    double calculateArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    Circle(){
        radius = 3.5;
    }
}
