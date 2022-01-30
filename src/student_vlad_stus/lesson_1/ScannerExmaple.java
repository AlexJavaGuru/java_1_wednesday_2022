package student_vlad_stus.lesson_1;

import java.util.Scanner;

public class ScannerExmaple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ввыод на консоль
        System.out.println("Zadatj znacenije dlja A");
        int variableA = scanner.nextInt();
        System.out.println("Zadatj znacenije dlja A");
        int variableB = scanner.nextInt();
        int result = variableA + variableB;
        System.out.println("Vvedite rezultat");
        System.out.println(result);
    }
}
