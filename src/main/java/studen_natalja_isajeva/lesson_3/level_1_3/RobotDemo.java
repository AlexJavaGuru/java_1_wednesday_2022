package studen_natalja_isajeva.lesson_3.level_1_3;

public class RobotDemo {
 public static void main(String[] args) {
     Robot myRobot = new Robot();

     myRobot.sayHello();
     myRobot.sayYourName();

     Robot robot1 = new Robot("Rider");

     robot1.sayHello();
     robot1.sayYourRobotName();

     Robot robot2 = new Robot("John");

     robot2.sayHello();
     robot2.sayYourRobotName();

 }

}
