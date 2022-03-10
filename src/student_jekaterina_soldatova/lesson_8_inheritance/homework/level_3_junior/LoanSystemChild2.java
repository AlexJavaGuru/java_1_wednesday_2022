package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_3_junior;

abstract class LoanSystemChild2 extends LoanSystem {
    String surname;

    LoanSystemChild2(String name, String surname) {
        super(name);
        this.surname = surname;
    }
}
