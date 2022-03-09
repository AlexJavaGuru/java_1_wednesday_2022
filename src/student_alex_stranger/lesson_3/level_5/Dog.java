package student_alex_stranger.lesson_3.level_5;

import java.util.Scanner;

public class Dog {

    String dogName;
    int age;
    String color;
    String newColor;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public void dogName() {
        System.out.println("Dog name :" + dogName);
    }

    public void voice() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the voice command:");
        String voice = scanner.nextLine();

    }
    public void voiceName() {
        System.out.println(dogName +" "+ dogName +" "+ dogName);

    }
    public void Age() {
        System.out.println("Dog age :" + age);
    }
    public void voiceAge() {
        System.out.println("Dog name" + age);
    }
    public void happyBirthday() {
        System.out.println("Happy birthday!" + " "+ dogName + " "+ age + " "+ (age++));
    }
    public void color() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the dog color:");
    String color = scanner.nextLine();
    System.out.println("Enter the voice command:");
    String voice = scanner.nextLine();
    System.out.println(dogName + " "+ age + " " + color + " ");
    }
    public void newColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dog new color:");
        String newColor = scanner.nextLine();
        System.out.println("Enter the voice command:");
        String voice = scanner.nextLine();
        System.out.println(dogName + " " + age + " " + newColor);
    }




}
