package student_ilja_jantikovs.lesson_2;

import java.util.Scanner;

public class NumberMultiplication {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int number;
            System.out.println("Enter the number: ");
            number=scanner.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(number+"*"+i+"="+number*i);
            }
        }
    }

