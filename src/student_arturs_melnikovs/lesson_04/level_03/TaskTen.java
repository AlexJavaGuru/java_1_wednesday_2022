package student_arturs_melnikovs.lesson_04.level_03;

import java.util.Scanner;

class TaskTen {
    public static void main(String[] args) {
        System.out.println("Введите 1ое целое число");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        System.out.println("Введите 2ое целое число");
        int secondNum = scanner.nextInt();

        System.out.println("Введите 3ие целое число");
        int thirdNum = scanner.nextInt();

        if(firstNum > secondNum && firstNum > thirdNum) {
            System.out.println(firstNum);
        } else if(secondNum > firstNum && secondNum > thirdNum) {
            System.out.println(secondNum);
        } else if(thirdNum > secondNum && thirdNum > firstNum){
            System.out.println(thirdNum);
        } else {
            System.out.println("Числа равны");
        }
    }
}
