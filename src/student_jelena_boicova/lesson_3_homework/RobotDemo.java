package student_jelena_boicova.lesson_3_homework;

public class RobotDemo {

    public static void main(String[] args) {

        Robot myRobot = new Robot("ROBO");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot myFirstRobot = new Robot("Rider");
        myFirstRobot.sayHello();
        myFirstRobot.sayYourName();

        Robot mySecondRobot = new Robot("John");
        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();
    }
}
