package teacher.lesson_10_collections.lessoncode;

import student_arturs_melnikovs.lesson_05.level_05.ArrayUtil;

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
