package student_igors.lesson_5.level_5;


public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();

        int[] array = util.createArray(5);
        util.arrayRandomNumbers(array);
        util.printArrayNumbers(array);
        System.out.println(util.maxNumbers(array));
    }
    }

