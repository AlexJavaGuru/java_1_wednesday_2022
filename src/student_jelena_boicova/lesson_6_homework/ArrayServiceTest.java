package student_jelena_boicova.lesson_6_homework;

public class ArrayServiceTest {

    public static void main(String[] args){
        ArrayServiceTest test = new ArrayServiceTest();
        test.searchNumber();
    }

    public void searchNumber(){
        ArrayService test = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        boolean actualResult = test.searchNumber(array,4);
        if (actualResult){
            System.out.println("Searched number is found");
        } else {
            System.out.println("Searched number is not found");
        }
    }
}