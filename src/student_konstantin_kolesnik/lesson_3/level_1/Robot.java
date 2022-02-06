package student_konstantin_kolesnik.lesson_3.level_1;

public class Robot {

    String name = "Wall.E";

    public Robot() {
    }
    public Robot(String name) {
        this.name=name;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
