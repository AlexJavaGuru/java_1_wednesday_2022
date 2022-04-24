package student_aleksandrs_korsaks.ak_lesson_3.level_1;

class Robot {

    String name;

    public Robot() {

    }

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
