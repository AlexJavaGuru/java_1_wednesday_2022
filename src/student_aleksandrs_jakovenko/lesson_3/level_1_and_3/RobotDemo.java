package student_aleksandrs_jakovenko.lesson_3.level_1_and_3;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myFirstRobot = new Robot("Rider");
        myFirstRobot.sayHello();
        myFirstRobot.sayYourName();

        Robot mySecondRobot = new Robot("John");
        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();
    }
}
