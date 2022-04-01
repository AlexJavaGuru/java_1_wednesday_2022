package student_jekaterina_soldatova.lesson_10.lessoncode;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<User> myTestArray = new LinkedList<>();

        myTestArray.add(new User("Alex", 1234L));
        myTestArray.add(new User("Kate", 54321L));
        myTestArray.add(new User("Leena", 1324L));
        myTestArray.add(new User("Daniele", 2675L));

        for (User user : myTestArray) {
            System.out.println(user);
        }

        boolean isAlexThere = myTestArray.contains(new User("Alex", 1234L));
        System.out.println(isAlexThere);
    }
}
