package student_jekaterina_soldatova.lesson_10.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> getUser(Long code) {
        for (User user : users) {
            if (user.getCode().equals(code)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
