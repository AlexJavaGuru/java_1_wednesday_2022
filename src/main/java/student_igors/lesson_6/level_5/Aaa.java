package student_igors.lesson_6.level_5;

public class Aaa {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arrInit = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + arrInit[i];
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

