package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class Circle {
    double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
