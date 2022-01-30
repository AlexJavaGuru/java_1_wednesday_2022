package studen_natalja_isajeva.lesson_2.level_1;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("calculation:");

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        int dev = firstNumber / secondNumber;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(dev);


    }
}
