package student_igors.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class TaskTwentySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size: ");
        int size = scanner.nextInt();


        int[] integerArray = new int[size];

        Random random = new Random();

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = random.nextInt(100);
            System.out.println("[" + i + "] = " + integerArray[i]);
                }
        int maxResult = QuickMaths.max(integerArray);
        System.out.println();
        System.out.println("Max number = " + maxResult);

            }
        }




//       Напишите программу, в которой:
//       - создайте массив произвольной длины
//       - заполните массив случайными числами
//       - распечатайте на консоль все элементы массива
//       - найдите наибольшее число в массиве и выведети его на консоль.