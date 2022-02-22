package student_konstantin_kolesnik.lesson_3.level_7;

import student_konstantin_kolesnik.lesson_3.level_7.Circle;

class CircleDemo {
    public static void main(String[] args) {
        Circle circleOne = new Circle(1.2345);
        double result = circleOne.calculateArea();
        System.out.println("Circle area = " + result);
    }
}
