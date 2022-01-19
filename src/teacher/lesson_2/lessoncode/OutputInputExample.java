package teacher.lesson_2.lessoncode;


import java.util.Scanner;

public class OutputInputExample {

    public static void main(String[] args) {
//        System.in
//        System.out
//        System.err
//        System.out.println("Result = " + 10 + " " + 15 + " Some String");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();
        System.out.println("User input = " + userInput);

//        double userInputDouble = scanner.nextDouble();
//        Scanner scanner2 = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        System.out.println(inputString);
//        System.out.println(userInputDouble);
    }
}
