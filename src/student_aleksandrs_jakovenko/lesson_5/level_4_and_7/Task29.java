package student_aleksandrs_jakovenko.lesson_5.level_4_and_7;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

class Task29 {
    public static void main(String[] args) {
//        int[] numbers;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int size = scanner.nextInt();
//        numbers = new int[size];
//        for (int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            int input = random.nextInt();
//            numbers[i] = input;
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Even numbers: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println("Even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
