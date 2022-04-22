package student_aleksandrs_korsaks.ak_lesson_9.level_3;

class FunctionalInterfaceExampleDemo {

    public static void main(String[] args) {

        FunctionalInterfaceExample test = x -> x % 2 == 0;
        System.out.println(test.isOddNumber(10));

    }
}
