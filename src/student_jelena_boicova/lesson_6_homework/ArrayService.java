package student_jelena_boicova.lesson_6_homework;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch){
        for (int i = 0; i < array.length; i++) {
            if (arr[i] == numberToSearch){
                return true;
            }
        }
        return false;
    }
