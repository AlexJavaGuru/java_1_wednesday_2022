package student_aleksandrs_korsaks.ak_lesson_5.level_5;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOfNumbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(arrayOfNumbers);
        arrayUtil.printArrayToConsole(arrayOfNumbers);
        int max = arrayUtil.findMaxNumber(arrayOfNumbers);
        System.out.println("Max value of array`s elements is: " + max);
        int min = arrayUtil.findMinNumber(arrayOfNumbers);
        System.out.println("Min value of array`s elements is: " + min);
    }
}
