package student_igors;

import java.util.Scanner;

public class Lesson_2_Scanner_in {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int result1 = variableA / variableB;
        int result2 = variableA * variableB;
        int result3 = variableA + variableB;
        int result4 = variableA - variableB;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}