package student_arturs_melnikovs.lesson_08.level_04;

class Rectangle extends Shape {
    private int height;
    private int width;

    Rectangle(String title, int height, int width) {
        super(title);
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (height + width);
    }
}
