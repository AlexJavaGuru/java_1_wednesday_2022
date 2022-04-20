package teacher.lesson_12_exceptions.lessoncode.v2;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankSystem {

    private static final String TOKEN = "1234";

    private List<User> users = new ArrayList<>();

    public BankSystem() {
        init();
    }

    public BankSystem(List<User> users) {
        this.users = users;
    }

    private void init() {
        //download all user from DB...
        users.add(new User(1L, "Alex"));
        users.add(new User(2L, "Oleg"));
        users.add(new User(3L, "Artur"));
        users.add(new User(4L, "Kate"));
        users.add(new User(5L, "Who?"));
    }

    public Optional<User> getUserById(Long id, String token) throws IllegalAccessException {
        if (id == null) {
            throw new IllegalArgumentException("User id is null..");
        }

        if (!TOKEN.equals(token)) {
            throw new IllegalAccessException("Token is invalid...");
        }

        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
