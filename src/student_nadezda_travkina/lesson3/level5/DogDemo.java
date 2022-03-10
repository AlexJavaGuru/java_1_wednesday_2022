package student_nadezda_travkina.lesson3.level5;

import java.util.Scanner;

class DogDemo {
    public static void main(String[] args) {
        System.out.print("Введите команду голос: ");
        Scanner scanner = new Scanner(System.in);

        Dog firstDog = new Dog("Reks ", 3, "black");
        firstDog.voice();
        System.out.println();

        firstDog.happyBirthday();
        firstDog.changeColor("white");
        firstDog.voice();
        System.out.println();
        firstDog.happyBirthday();
        firstDog.changeColor("yellow");
        firstDog.voice();
        System.out.println();


    }
}
