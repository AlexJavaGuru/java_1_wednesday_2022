package student_igors.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size :");
        int size = scanner.nextInt();
        int[] number = new int[size];
        System.out.println("Enter your number : ");


        for (int i = 0; i < number.length; i++){
            int userInput = scanner.nextInt();
            number[i] = userInput;
        }
        System.out.println(Arrays.toString(number));
    }
}

//     Напишите программу, в которой:
//     - запросите у пользователя с консоли длину массива
//     - создайте массив указанной пользователем длины
//     - заполните массив числами полученными от пользователя
//     - распечатайте на консоль все элементы массива.