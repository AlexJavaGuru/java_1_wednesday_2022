package teacher.lesson_2.lessoncode;

public class MathOperationsExample {

    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 3;

        int sum = numberOne + numberTwo;
        System.out.println(sum);
        System.out.println(numberOne + numberTwo);

//        double sumTwo = numberOne / numberTwo; - 3.0
        double numberThree = 10.0;

//        double sumTwo = numberThree / numberTwo + numberOne;
        double sumTwo =  numberOne / (double) numberTwo + numberOne;
//        System.out.println(sumTwo);

        numberOne = 5; // 3 + 2
        numberTwo = 3;

        int result = numberOne % numberTwo;
        System.out.println(result);
    }
}
