package student_arturs_melnikovs.lesson_08.level_04;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println(shapeUtil.calculateArea(circle));
        System.out.println(shapeUtil.calculatePerimeter(circle));
    }
}
