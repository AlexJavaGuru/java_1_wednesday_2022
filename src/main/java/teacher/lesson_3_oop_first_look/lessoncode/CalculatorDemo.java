package teacher.lesson_3_oop_first_look.lessoncode;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int result = myCalc.sum(10, 20);
        System.out.println("The result is: " + result);
    }
}
