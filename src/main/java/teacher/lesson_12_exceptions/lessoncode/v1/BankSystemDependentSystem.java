package teacher.lesson_12_exceptions.lessoncode.v1;

import java.util.Optional;

public class BankSystemDependentSystem {

    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();

        try {
            Optional<User> user = bankSystem.getUserById(4L, "4321");
            if (user.isPresent()) {
                System.out.println(user.get().toString());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Continue working...");

    }
}
