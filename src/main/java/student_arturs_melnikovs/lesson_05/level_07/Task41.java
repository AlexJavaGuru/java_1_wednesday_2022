package student_arturs_melnikovs.lesson_05.level_07;

import student_arturs_melnikovs.lesson_05.level_05.ArrayUtil;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива..");
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        scanner.close();
        int[] myArray = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        arrayUtil.printArrayToConsole(myArray);
        System.out.println("Max number: " + arrayUtil.findMaxNumber(myArray));
        System.out.println("Min number: " + arrayUtil.findMinNumber(myArray));
        arrayUtil.printEvenNumbers(myArray);
        arrayUtil.printOddNumbers(myArray);
    }
}
