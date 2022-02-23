package student_konstantin_kolesnik.lesson_3.level_1;

public class Robot {
    String roboName;

    public Robot() {
    }

    public Robot(String roboName) {
        this.roboName=roboName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + roboName);
    }
}
