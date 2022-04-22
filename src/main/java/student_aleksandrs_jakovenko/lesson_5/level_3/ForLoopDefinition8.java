package student_aleksandrs_jakovenko.lesson_5.level_3;

class ForLoopDefinition8 {

    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++ ) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}