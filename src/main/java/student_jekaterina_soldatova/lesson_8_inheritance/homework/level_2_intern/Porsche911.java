package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_2_intern;

class Porsche911 extends Car{

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
