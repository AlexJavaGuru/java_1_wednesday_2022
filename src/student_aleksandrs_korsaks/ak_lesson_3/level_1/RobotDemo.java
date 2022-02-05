package student_aleksandrs_korsaks.ak_lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot demoRobot = new Robot("Demo");
        demoRobot.sayHello();
        demoRobot.sayYourName();
        System.out.println("");

        Robot robotOne = new Robot("Rider");
        robotOne.sayHello();
        robotOne.sayYourName();
        System.out.println("");

        Robot robotTwo = new Robot("John");
        robotTwo.sayHello();
        robotTwo.sayYourName();
        System.out.println("");
    }
}
