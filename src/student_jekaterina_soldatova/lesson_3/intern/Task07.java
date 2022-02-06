package student_jekaterina_soldatova.lesson_3.intern;

import java.util.Scanner;

class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String yourName = scanner.nextLine();
        String myName = "Kate";
        String greeting = "Hi " + yourName + ", my name is " + myName + "!";

        System.out.println(greeting);


    }
}
