package student_arturs_melnikovs.lesson_12.level_01;

import java.util.Scanner;

class ExceptionDemo {

    public static void main(String[] args) throws MyException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 9: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 9) {
            throw new MyException("Wrong number");
        }
    }
}
