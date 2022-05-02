package student_andrejs_saldavs.lesson_03.level_1;

public class Robot {

    String helloText;
    String robotName;

    int robotAge;
    String robotColor;



    public String sayHello() {
        return helloText;
    }

    public String sayYourName() {
        System.out.println(robotAge);
        System.out.println(robotColor);
        return "My name is " + robotName;
    }

    public Robot() {

    }

    public Robot(String helloText, String robotName, int robotAge, String robotColor) {
        this.helloText = helloText;
        this.robotName = robotName;
        this.robotAge = robotAge;
        this.robotColor = robotColor;
    }



}

