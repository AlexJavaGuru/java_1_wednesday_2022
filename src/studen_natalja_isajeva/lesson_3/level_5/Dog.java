package studen_natalja_isajeva.lesson_3.level_5;

import java.util.Scanner;

public class Dog {
    String name;
    int age;
    String color;
    String newColor;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dogName() {
        System.out.println("Dog name : " + name);
    }

    public void voice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input command Voice ! : ");
        String voice = scanner.nextLine();
    }

    public void voiceName() {
        System.out.println(name + "! " + name + "! " + name + "! ");
    }

    public void dogAge() {
        System.out.println("Dog age : " + age);

    }

    public void voiceAge() {
        System.out.println(name + age + "! " + name + age + "! " + name + age + "! ");

    }

    public void dogAgeTwo() {
        System.out.println("Dog age : " + (age + 1));
    }

    public void happyBirthaDay() {
        System.out.println("Happy Birthday" + " " + name + " !");
    }

    public void dogColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dog color: ");
        String color = scanner.nextLine();
        System.out.println("Input command Voice ! : ");
        String voice = scanner.nextLine();
        System.out.println(name + " " + age + " age " + color + " color!");
    }

    public void changeColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dog new color: ");
        String newColor = scanner.nextLine();
        System.out.println("Input command Voice ! : ");
        String voice = scanner.nextLine();
        System.out.println(name + " " + age + " age " + newColor + " color!");

    }
}



