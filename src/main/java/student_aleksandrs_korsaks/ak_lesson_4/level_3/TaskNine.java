package student_aleksandrs_korsaks.ak_lesson_4.level_3;

import java.util.Scanner;

class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st integer");
        int inputNumberOne = scanner.nextInt();
        System.out.println("Please input 2nd integer");
        int inputNumberTwo = scanner.nextInt();
        System.out.println("Please input 3rd integer");
        int inputNumberThree = scanner.nextInt();

        if ((inputNumberOne > inputNumberTwo) && (inputNumberTwo > inputNumberThree)) {
            System.out.println("Numbers decreasing");
        } else if ((inputNumberOne < inputNumberTwo) && (inputNumberTwo < inputNumberThree)) {
            System.out.println("Numbers increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
