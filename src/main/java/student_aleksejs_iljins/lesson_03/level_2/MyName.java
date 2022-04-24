package student_aleksejs_iljins.lesson_03.level_2;

import java.util.Scanner;

class MyName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Привет " +  name + "!");
    }

}
