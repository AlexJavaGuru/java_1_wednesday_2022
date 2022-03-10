package student_nadezda_travkina.lesson3.level2;

import java.util.Scanner;

 class NameSecond {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, напишите Ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        System.out.print("Hello " + Name + "!");
    }
}

