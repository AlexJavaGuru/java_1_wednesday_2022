package student_andrejs_saldavs.lesson_08.level_4;

class Triangle extends Shape {

    private double triangleSide;

    Triangle(String title, double triangleSide) {
        super(title);
        this.triangleSide = triangleSide;
    }

    @Override
    double calculateArea() {
        return triangleSide * triangleSide * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return triangleSide * 3;
    }
}
