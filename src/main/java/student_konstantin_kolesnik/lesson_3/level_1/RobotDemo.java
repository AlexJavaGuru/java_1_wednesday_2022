package student_konstantin_kolesnik.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot rider = new Robot("Rider");
        rider.sayHello();
        rider.sayYourName();

        Robot john = new Robot("John");
        john.sayHello();
        john.sayYourName();
    }
}
