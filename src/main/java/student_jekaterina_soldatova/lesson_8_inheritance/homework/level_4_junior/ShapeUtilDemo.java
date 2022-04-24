package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_4_junior;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        createCircle(shapeUtil);
        createSquare(shapeUtil);
        createRectangle(shapeUtil);
        createTriangle(shapeUtil);
    }

    static void createCircle(ShapeUtil shapeUtil) {
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("circle area: " + circleArea);
        System.out.println("circle perimeter: " + circlePerimeter);
    }

    static void createSquare(ShapeUtil shapeUtil) {
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("square area: " + squareArea);
        System.out.println("square perimeter: " + squarePerimeter);
    }

    static void createRectangle(ShapeUtil shapeUtil) {
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("rectangle area: " + rectangleArea);
        System.out.println("rectangle perimeter: " + rectanglePerimeter);
    }

    static void createTriangle(ShapeUtil shapeUtil) {
        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("triangle area: " + triangleArea);
        System.out.println("triangle perimeter: " + trianglePerimeter);
    }

}
