package student_jekaterina_soldatova.lesson_10_collections.lessoncode;

import teacher.lesson_10_collections.lessoncode.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<teacher.lesson_10_collections.lessoncode.User> myTestArray = new LinkedList<>();

        myTestArray.add(new teacher.lesson_10_collections.lessoncode.User("Alex", 1234L));
        myTestArray.add(new teacher.lesson_10_collections.lessoncode.User("Kate", 54321L));
        myTestArray.add(new teacher.lesson_10_collections.lessoncode.User("Leena", 1324L));
        myTestArray.add(new teacher.lesson_10_collections.lessoncode.User("Daniele", 2675L));

        for (teacher.lesson_10_collections.lessoncode.User user : myTestArray) {
            System.out.println(user);
        }

        boolean isAlexThere = myTestArray.contains(new User("Alex", 1234L));
        System.out.println(isAlexThere);
    }
}
