package student_igors.lesson_5.level_7;

import student_igors.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class FourtyOne {

    private static ArrayUtil ar;

    public static void main(String[] args) {
        System.out.println("Введите длину массива..");
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        scanner.close();
        int[] myArray = arrayUtil.createArray(arrayLength);
        arrayUtil.arrayRandomNumbers(myArray);
        arrayUtil.printArrayNumbers(myArray);
        System.out.println("Max number: " + arrayUtil.maxNumbers(myArray));
        System.out.println("Min number: " + arrayUtil.minNumber(myArray));
        arrayUtil.printEvenNumbers(myArray);
        arrayUtil.printOddNumbers(myArray);

    }
}
