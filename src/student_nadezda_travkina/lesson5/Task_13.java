package student_nadezda_travkina.lesson5;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println("Indeks Nr.0 value is: " + numbers[0]);
        System.out.println("Indeks Nr.1 value is: " + numbers[1]);
        System.out.println("Indeks Nr.2 value is: " + numbers[2]);

        int allSum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("All indeks value is: " + allSum);
    }
}

