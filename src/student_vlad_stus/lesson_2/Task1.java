package student_vlad_stus.lesson_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite pervoje 4islo ");
        int sumA = scanner.nextInt();
        System.out.println("Vvedite vtoroje 4islo ");
        int sumB = scanner.nextInt();
        System.out.println(sumA + sumB);
        System.out.println(sumA - sumB);
        System.out.println(sumA / sumB);
        System.out.println(sumA % sumB);
        System.out.println(sumA * sumB);
    }
}
