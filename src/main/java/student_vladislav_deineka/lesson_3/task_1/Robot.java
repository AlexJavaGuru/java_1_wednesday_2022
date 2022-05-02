package student_vladislav_deineka.lesson_3.task_1;

public class Robot {

    String name;
    int age;

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My Name is " + this.name);
    }
    public void sayYourAge() {
        System.out.println("My age is " + this.age + " years old");
    }}
