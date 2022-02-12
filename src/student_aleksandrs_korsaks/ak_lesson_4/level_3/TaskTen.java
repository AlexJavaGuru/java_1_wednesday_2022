package student_aleksandrs_korsaks.ak_lesson_4.level_3;

import java.util.Scanner;

class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st integer");
        int inputNumberOne = scanner.nextInt();
        System.out.println("Please input 2nd integer");
        int inputNumberTwo = scanner.nextInt();
        System.out.println("Please input 3rd integer");
        int inputNumberThree = scanner.nextInt();

//Variant nr. 1
        if ((inputNumberOne >= inputNumberTwo) && (inputNumberOne >= inputNumberThree)) {
            System.out.println("V_1 Max number is " + inputNumberOne);
        } else if (inputNumberTwo >= inputNumberThree) {
            System.out.println("V_1 Max number is " + inputNumberTwo);
        } else {
            System.out.println("V_1 Max number is " + inputNumberThree);
        }

/*
Variant nr. 2
Долго думал над вторым вариантом, так ничего и не придумал :),
поэтому подсмотрел в интернете. В любом случае - опробовал хоть.
*/
        int maxValue;
        maxValue = inputNumberOne;
        if (inputNumberTwo > maxValue)
            maxValue = inputNumberTwo;
        if (inputNumberThree > maxValue)
            maxValue = inputNumberThree;

        System.out.println("V_2 Max number is " + maxValue);

    }
}
