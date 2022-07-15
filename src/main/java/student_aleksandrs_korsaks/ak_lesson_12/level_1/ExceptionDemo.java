package student_aleksandrs_korsaks.ak_lesson_12.level_1;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1-3");

        int exceptionNumber = scanner.nextInt();
        switch (exceptionNumber) {
            case 1 -> throw new IllegalClassFormatException();
            case 2 -> throw new IllegalClassFormatException("IllegalClassFormatException");
        }
    }
}
