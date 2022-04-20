package student_nikita_visnakov.lesson3;

public class Robot {

    String hello;
    String name;
    String age;
    String model;

    public Robot() {
    }
    public void sayHello(){
        System.out.println(" Hello! ");
    }
    public void sayYourName() {
        System.out.println("My name is" +name);
    }

    public Robot(String hello,String name) {
        this.hello = hello;
        this.name = name;
    }

    public String hello(){
        return hello;}

    public String name(){
        return name;}

}





