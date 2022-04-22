package student_vladislav_deineka.lesson_3.task_1;

public class RobotDemo {
    public static void main(String[] args) {
        Robot MyRobot = new Robot("BOBOT", 4);
        MyRobot.sayHello();
        MyRobot.sayYourName();
        MyRobot.sayYourAge();

        Robot MySecondRobot = new Robot("MOMOT", 5);
        MySecondRobot.sayHello();
        MySecondRobot.sayYourName();
        MySecondRobot.sayYourAge();

        Robot MyThirdRobot = new Robot("LOLOT",6);
        MyThirdRobot.sayHello();
        MyThirdRobot.sayYourName();
        MyThirdRobot.sayYourAge();


    }
}
