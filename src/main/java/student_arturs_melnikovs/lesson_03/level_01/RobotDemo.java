package student_arturs_melnikovs.lesson_03.level_01;

class RobotDemo {

    public static void main(String[] args) {
        Robot myRobot = new Robot("ROBO");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot("Biba");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Boba");
        robot2.sayHello();
        robot2.sayYourName();
    }

}
