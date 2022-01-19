package teacher.lesson_2.lessoncode;

public class VariablesDemo {

    public static void main(String[] args) {
        /*
        Java block comment
         */
        int numberOne = 10;
        int numberTwo = 20;

        //int numberTwo = 20; - запрещенная операция
//        numberTwo = 1000000000;

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);

        double numberThree = 5.5;
        double numberFour = numberOne;

        double sumTwo = numberThree + numberTwo;

//        System.out.println(numberFour);
        System.out.println("Sum with double = " + sumTwo);

//        float test = 5.9f;

        boolean value = true;
//        boolean value = false;

        char symbol = 'D';
//        char symbol = 'DA'; - impossible
    }
}
