package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        // Если число делится на 2, то это четное число, иначе - нечетное
        // если остаток от деления равен нулю, то четное

        if ( number % 2 == 0 ){
            System.out.println("Число четное");
        }
        else
            System.out.println("Число нечетное");
    }

}
