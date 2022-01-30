/*
Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.
 */
package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class internTask11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you want to use for arithmetic average?");
        int amountOfInputs = scanner.nextInt();


        int[] inputs;
        inputs = new int[amountOfInputs];
        int sum = 0;

        System.out.println("Please enter " + amountOfInputs + " integers");
        for (int i = 0; i < amountOfInputs; i++){
            inputs[i] = scanner.nextInt();
            sum += inputs[i];
        }

        System.out.println("Arithmetic average of your numbers is " + (double) sum / amountOfInputs);
    }
}
