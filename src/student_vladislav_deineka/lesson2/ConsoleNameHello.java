package student_vladislav_deineka.lesson2;

import java.util.Scanner;


public class ConsoleNameHello {
    public static void main(String[] args) {

        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Write your age!");
        int Name = nameScanner.nextInt();
        System.out.println("You are " + Name + " age old!");

    }
}

