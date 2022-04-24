package student_nikita_visnakov.lesson3;

import java.awt.*;

public class Dog {
    String name;
    int age;
    String color;
    String newColor;

    public Dog() {
    }

    public void getVoice() {
        System.out.println( name+ " " + name+ " " +  name );
        System.out.println(getAge());
        System.out.println(color);
        System.out.println(newColor);
    }
    public Dog(String name , int age , String color , String newColor){
        this.name = name;
        this.age = age;
        this.color = color;
        this.newColor = newColor;

    }
    public String name() {
        return name;
    }

    public void happyBirthday(){
        this.age = age + 1;
    }
    public int getAge() {
        return age;
    }
    public void changeColor(){
        System.out.println("Now color is " + color);
        System.out.println("Changing color");
        System.out.println("Now color is " + newColor);


    }

}


