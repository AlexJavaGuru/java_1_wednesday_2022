package teacher.lesson_10_collections.lessoncode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<User> myTestSet = new HashSet<>();

        myTestSet.add(new User("A", 1L));
        myTestSet.add(new User("B", 2L));
        myTestSet.add(new User("C", 3L));
        myTestSet.add(new User("D", 4L));
        myTestSet.add(new User("E", 5L));
        myTestSet.add(new User("F", 6L));
        myTestSet.add(new User("G", 7L));
        myTestSet.add(new User("K", 8L));
        myTestSet.add(new User("L", 9L));
        myTestSet.add(new User("M", 10L));
        myTestSet.add(new User("N", 11L));
        myTestSet.add(new User("O", 12L));
        myTestSet.add(new User("P", 13L));
        myTestSet.add(new User("Q", 14L));
        myTestSet.add(new User("W", 15L));
        myTestSet.add(new User("E", 16L));
        myTestSet.add(new User("D", 17L));

        for (User user : myTestSet) {
            System.out.println(user);
        }

        List<User> myUsers = new ArrayList<>();

        myUsers.add(new User("A", 1L));
        myUsers.add(new User("A", 1L));
        myUsers.add(new User("A", 1L));
        myUsers.add(new User("B", 2L));
        myUsers.add(new User("C", 3L));
        myUsers.add(new User("C", 3L));
        myUsers.add(new User("C", 100L));
        myUsers.add(new User("C", 3L));
        myUsers.add(new User("D", 4L));
        myUsers.add(new User("D", 4L));
        myUsers.add(new User("D", 4L));
        myUsers.add(new User("D", 4L));
        myUsers.add(new User("E", 5L));

        Set<User> uniqueUsers = new HashSet<>(myUsers);

        System.out.println(uniqueUsers);
    }
}
