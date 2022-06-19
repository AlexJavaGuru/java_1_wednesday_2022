package student_nadezda_travkina.lesson5_arrays_for_loop;

public class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println("Indeks Nr.0 value is: " + numbers[0]);
        System.out.println("Indeks Nr.1 value is: " + numbers[1]);
        System.out.println("Indeks Nr.2 value is: " + numbers[2]);
        int allSum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("All indeks value is: " + allSum);
        int numbersAverage = allSum / numbers.length;
        System.out.println("All indeks average is: " + numbersAverage);
    }
}

