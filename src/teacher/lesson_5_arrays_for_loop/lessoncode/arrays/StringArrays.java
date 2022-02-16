package teacher.lesson_5_arrays_for_loop.lessoncode.arrays;

import java.util.Arrays;

public class StringArrays {

    public static void main(String[] args) {
//        String[] myStringArray = {"Hello", "My", "Name", "Is", "Alex"};
        String[] myStringArray = new String[10];
        myStringArray[0] = "Hello";
        myStringArray[1] = "My";
        myStringArray[2] = "Name";
        myStringArray[3] = "Is";
        myStringArray[4] = "Alex";
        myStringArray[9] = "End";

//        System.out.println(Arrays.toString(myStringArray));

//        String word = myStringArray[4];
//        System.out.println(word);

        for (String word : myStringArray) {
            System.out.println(word);
        }
    }
}
