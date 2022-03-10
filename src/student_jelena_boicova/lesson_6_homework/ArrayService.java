package student_jelena_boicova.lesson_6_homework;

public class ArrayService {

    boolean searchNumber(int[] array, int numberToSearch){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch){
                return true;
            }
        }
        return false;
    }
}
