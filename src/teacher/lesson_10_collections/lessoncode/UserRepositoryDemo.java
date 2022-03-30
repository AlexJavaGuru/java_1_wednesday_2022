package teacher.lesson_10_collections.lessoncode;

import java.util.Optional;

public class UserRepositoryDemo {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(new User("Alex", 1111L));
        userRepository.addUser(new User("Kate", 2222L));
        userRepository.addUser(new User("Artur", 3333L));
        userRepository.addUser(new User("Alex2", 4444L));


        Optional<User> optionalUser = userRepository.getUser(6666L);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            System.out.println(user.getName());
        }
    }
}
