package student_nadezda_travkina.lesson5_arrays_for_loop;

public class Task_12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }
    }
}
