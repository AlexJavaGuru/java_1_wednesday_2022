package student_nadezda_travkina.lesson3.level1;

import student_nadezda_travkina.lesson3.level1.Robot;

class RobotDemo {
     public static void main(String[] args) {
       Robot robot1 = new Robot("Rider");
       robot1.sayHello();
       robot1.sayYourname();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourname();
    }
}