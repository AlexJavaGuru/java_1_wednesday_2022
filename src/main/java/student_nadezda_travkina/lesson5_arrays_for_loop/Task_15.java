package student_nadezda_travkina.lesson5_arrays_for_loop;

public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println("Indeks Nr.0 value is: " + numbers[0]);
        System.out.println("Indeks Nr.1 value is: " + numbers[1]);
        System.out.println("Indeks Nr.2 value is: " + numbers[2]);
        int indexZeroPlus = numbers[0] + 2;
        int indexOnePlus = numbers[1] + 2;
        int indexTwoPlus = numbers[2] + 2;
        System.out.println("Indeks Nr.0 add 2 value is: " + indexZeroPlus);
        System.out.println("Indeks Nr.1 add 2 value is: " + indexOnePlus);
        System.out.println("Indeks Nr.2 add 2 value is: " + indexTwoPlus);
    }
}

