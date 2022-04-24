package student_andrejs_saldavs.lesson_03.level_1;

public class RobotDemo {

    public static void main(String[] args) {

        Robot robotOne = new Robot("Hello", "ROBO", 20, "Black");

        String firstRobotText = robotOne.sayHello();
        System.out.println(firstRobotText);
        String firstRobotName = robotOne.sayYourName();
        System.out.println(firstRobotName);

        Robot testRobot;
        testRobot = new Robot("Hi", "George", 23, "White");

        String secondRobotText = testRobot.sayHello();
        System.out.println(secondRobotText);
        String secondRobotName = testRobot.sayYourName();
        System.out.println(secondRobotName);

    }

}
