package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class ConditionalSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick the option...");
        System.out.println("1 - Add new product");
        System.out.println("2 - Delete product");
        System.out.println("3 - Search for a product");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Option 3 selected");
                break;
            default:
                System.out.println("There is no such option...");
        }
    }
}
