package student_igors.lesson_3.level_5;

import java.util.Scanner;


public class DogDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Giv command voice:");
        String name = scanner.nextLine();
        System.out.println("Gav gav gav");
        System.out.println("Giv command change Dog color:");
        String color = scanner.nextLine();
        System.out.println("Giv command voice:");
        String voice = scanner.nextLine();
        System.out.println("Gav gav gav");
        System.out.println("Neu color is black");

        //----------------------------------------------------------------
        Dog myDog = new Dog("Cika", 5, " White color");
        myDog.voice();
        myDog.voice();

        myDog.voice();
        myDog.happyBirthday();

        myDog.name = "Cika";
        myDog.age = 5;
        System.out.println(myDog.name + " is " + myDog.age  +  " years old");
    }
    //--------------------------
    Dog sarik = new Dog("Sarik", 7, "Grey");


}
