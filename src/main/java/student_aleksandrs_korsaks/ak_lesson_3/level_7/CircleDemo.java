package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class CircleDemo {
    public static void main(String[] args) {
        Circle demoCircle = new Circle(20);
        double areaCalculationResult = demoCircle.calculateArea();
        System.out.println("Area of the Circle is : " + Math.round(areaCalculationResult * 100.0) / 100.0 + " cm2");
    }
}
