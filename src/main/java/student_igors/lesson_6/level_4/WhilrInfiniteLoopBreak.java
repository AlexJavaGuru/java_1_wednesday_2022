package student_igors.lesson_6.level_4;

import java.util.Scanner;

public class WhilrInfiniteLoopBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Infinite loop");
            System.out.println("Enter number");
            int number = scanner.nextInt();
            if (number == 2) {
                break;
            }
        }
        System.out.println("End");
    }
}
