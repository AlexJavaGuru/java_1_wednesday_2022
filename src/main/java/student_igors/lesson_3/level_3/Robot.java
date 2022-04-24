package student_igors.lesson_3.level_3;

public class Robot {
    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }
public  void  sayGoodDay() {
        System.out.println("Good day!");
}
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}