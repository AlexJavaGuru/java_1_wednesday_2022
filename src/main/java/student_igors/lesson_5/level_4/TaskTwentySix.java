package student_igors.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class TaskTwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size: ");
        int size = scanner.nextInt();


        int[] integerArray = new int[size];

        Random random = new Random();

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = random.nextInt(100);
            System.out.println(integerArray[i]);
        }
    }

}


//       Напишите программу, в которой:
//       - запросите у пользователя с консоли длину массива
//       - создайте массив указанной пользователем длины
//       - заполните массив случайными числами
//       - распечатайте на консоль все элементы массива.