package student_alex_stranger.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int firstNumber = scanner.nextInt();
      System.out.println("Enter the second number");
      int secondNumber = scanner.nextInt();

 int sumResult = firstNumber + secondNumber;
 int subResult = firstNumber - secondNumber;
 int multResult = firstNumber * secondNumber;
 int divResult = firstNumber / secondNumber;

 System.out.println(firstNumber + " + " + secondNumber + " = " + sumResult);
 System.out.println(firstNumber + " - " + secondNumber + " = " + subResult);
 System.out.println(firstNumber + " * " +secondNumber + " = " + multResult);
 System.out.println(firstNumber + " / " + secondNumber + " = "+ divResult);




  }

}
