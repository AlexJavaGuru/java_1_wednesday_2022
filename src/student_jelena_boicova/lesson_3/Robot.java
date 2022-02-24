package student_jelena_boicova.lesson_3;

public class Robot {
    String name;

    public void sayHello() {
        System.out.println("Hello!");

    }

    public Robot(){

    }

    public Robot(String robotName){
        name = robotName;

    }

    void sayYourName() {
        System.out.println("My name is " + this.name);

        }
    }
