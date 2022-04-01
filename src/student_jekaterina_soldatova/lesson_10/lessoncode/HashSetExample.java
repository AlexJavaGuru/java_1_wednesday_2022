package student_jekaterina_soldatova.lesson_10.lessoncode;

import teacher.lesson_10_collections.lessoncode.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<teacher.lesson_10_collections.lessoncode.User> myTestSet = new HashSet<>();

        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("A", 1L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("B", 2L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("C", 3L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("D", 4L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("E", 5L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("F", 6L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("G", 7L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("K", 8L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("L", 9L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("M", 10L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("N", 11L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("O", 12L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("P", 13L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("Q", 14L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("W", 15L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("E", 16L));
        myTestSet.add(new teacher.lesson_10_collections.lessoncode.User("D", 17L));

        for (teacher.lesson_10_collections.lessoncode.User user : myTestSet) {
            System.out.println(user);
        }

        List<teacher.lesson_10_collections.lessoncode.User> myUsers = new ArrayList<>();

        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("A", 1L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("A", 1L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("A", 1L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("B", 2L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("C", 3L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("C", 3L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("C", 100L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("C", 3L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("D", 4L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("D", 4L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("D", 4L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("D", 4L));
        myUsers.add(new teacher.lesson_10_collections.lessoncode.User("E", 5L));

        Set<User> uniqueUsers = new HashSet<>(myUsers);

        System.out.println(uniqueUsers);
    }
}
