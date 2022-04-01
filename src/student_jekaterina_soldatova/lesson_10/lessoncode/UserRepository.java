package student_jekaterina_soldatova.lesson_10.lessoncode;

import teacher.lesson_10_collections.lessoncode.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<teacher.lesson_10_collections.lessoncode.User> users = new ArrayList<>();

    public void addUser(teacher.lesson_10_collections.lessoncode.User user) {
        users.add(user);
    }

    public Optional<teacher.lesson_10_collections.lessoncode.User> getUser(Long code) {
        for (User user : users) {
            if (user.getCode().equals(code)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
