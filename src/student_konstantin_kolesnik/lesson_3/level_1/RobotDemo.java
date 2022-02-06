package student_konstantin_kolesnik.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot walle = new Robot();
        walle.sayHello();
        walle.sayYourName();
        Robot R2D2 = new Robot("R2D2");
        R2D2.sayHello();
        R2D2.sayYourName();
    }
}
