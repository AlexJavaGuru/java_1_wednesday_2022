package student_aleksandrs_jakovenko.lesson_5.level_4_and_7;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

public class Task28 {
    public static void main(String[] args) {
//        int[] numbers;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int size = scanner.nextInt();
//        numbers = new int[size];
//        for (int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            numbers[i] = random.nextInt();
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        int min = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[0];
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println("Min number = " + min);

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println(arrayUtil.findMinNumber(numbers));
    }
}
