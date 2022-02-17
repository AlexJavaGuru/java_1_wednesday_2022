package studen_natalja_isajeva.lesson_3.level_1_3;

public class Robot {
    String robotName;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public Robot() {

    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public void sayYourRobotName() {
        System.out.println("My name is " + this.robotName);
    }
}
