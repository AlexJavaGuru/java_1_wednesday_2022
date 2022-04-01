package student_jekaterina_soldatova.lesson_10.lessoncode;

import teacher.lesson_10_collections.lessoncode.User;
import teacher.lesson_10_collections.lessoncode.UserRepository;

import java.util.Optional;

public class UserRepositoryDemo {

    public static void main(String[] args) {

        teacher.lesson_10_collections.lessoncode.UserRepository userRepository = new UserRepository();

        userRepository.addUser(new teacher.lesson_10_collections.lessoncode.User("Alex", 1111L));
        userRepository.addUser(new teacher.lesson_10_collections.lessoncode.User("Kate", 2222L));
        userRepository.addUser(new teacher.lesson_10_collections.lessoncode.User("Artur", 3333L));
        userRepository.addUser(new teacher.lesson_10_collections.lessoncode.User("Alex2", 4444L));


        Optional<teacher.lesson_10_collections.lessoncode.User> optionalUser = userRepository.getUser(6666L);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            System.out.println(user.getName());
        }
    }
}
