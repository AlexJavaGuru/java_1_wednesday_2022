/*
Заставьте эту программу работать!

class SizeMatters {
    public static void main(String[] args) {
        system.out.println("Sorry, I have an errors.");
        system.out.println("Please fix me!")
    }
}
*/
package student_jekaterina_soldatova.lesson02.level_5_middle;

import java.util.Scanner;

public class MiddleTask18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = "Sorry, I have an error.";
        int offset;

        System.out.println("Please enter a line to cipher:");
        original = scanner.nextLine();
        System.out.println("Please enter the offset(integer) for the cipher:");
        offset = scanner.nextInt();

        CaesarCipher result = new CaesarCipher();

        System.out.println(result.Shift(original, offset));

    }
}
