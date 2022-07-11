package student_aleksandrs_korsaks.ak_lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorExample {

    public static void main(String[] args) {
        List<UserForExample> users = new ArrayList<UserForExample>();

        for (int i = 0; i > -1; i++) {
            users.add(new UserForExample(i));
        }
    }
}
