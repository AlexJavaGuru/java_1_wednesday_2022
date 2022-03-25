package student_igors.lesson_5.level_5;


import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }


    public void arrayRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void printArrayNumbers(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int maxNumbers(int[] array) {
        int maxNumber = array[0];
        for(int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
    public int minNumber(int[] array) {
        int minNumber = array[0];
        for(int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    public void printEvenNumbers(int[] array) {
        System.out.println("Even numbers: ");
        for (int number : array) {
            if(number % 2 == 0) {
                System.out.println( + number);
            }
        }
    }

    public void printOddNumbers(int[] array) {
        System.out.println("Odd numbers: ");
        for (int number : array) {
            if(number % 2 != 0) {
                System.out.println( + number);
            }
        }
    }


}


//      Создайте класс ArrayUtil.
//      Напишите в этом классе метод для создания
//      массива целых чисел указанной длины.


// Напишите реализацию !!!


