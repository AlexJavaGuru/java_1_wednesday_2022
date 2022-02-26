package student_jekaterina_soldatova.lesson06.level01.level_3_junior;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService check = new ArrayService();
        int[] array = {1, 2, 3, 3};
        int number = 4;
        int result = check.CheckArrayForNumber(array, number);
        System.out.println(result);
    }
}
