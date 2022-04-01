package student_jekaterina_soldatova.lesson_10.lessoncode;

import teacher.lesson_10_collections.lessoncode.User;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        teacher.lesson_10_collections.lessoncode.User alex = new teacher.lesson_10_collections.lessoncode.User("Alex", 1234L);
        teacher.lesson_10_collections.lessoncode.User alex1 = new teacher.lesson_10_collections.lessoncode.User("Alex", 9999L);
        teacher.lesson_10_collections.lessoncode.User alex2 = new teacher.lesson_10_collections.lessoncode.User("Alex", 1234L);
        teacher.lesson_10_collections.lessoncode.User kate = new teacher.lesson_10_collections.lessoncode.User("Kate", 1234L);

        System.out.println(alex.hashCode());
        System.out.println(alex2.hashCode());
        System.out.println(kate.hashCode());

        Map<Integer, teacher.lesson_10_collections.lessoncode.User> userMap = new HashMap<>();

        userMap.put(1, alex);
        userMap.put(4, alex1);
        userMap.put(100, alex2);
        userMap.put(100, kate);
        userMap.put(3, kate);

        teacher.lesson_10_collections.lessoncode.User user = userMap.get(4);
        user.setCode(10000000L);
        userMap.put(4, user);


        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // hashCode() & (n - 1) где n = size (15)
        //11110001101010001000010101 -hash(key)
        //00000000000000000000001111
        //00000000000000000000000101 - bucket = 5


        //100010011101100001100001100
        //000000000000000000000001111
        //000000000000000000000001100 = bucket = 12
    }
}
