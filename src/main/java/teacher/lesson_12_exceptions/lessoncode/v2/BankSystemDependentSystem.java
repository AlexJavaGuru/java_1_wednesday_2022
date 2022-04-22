package teacher.lesson_12_exceptions.lessoncode.v2;

import java.util.Optional;

public class BankSystemDependentSystem {

    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();

        try {
            Optional<User> user = bankSystem.getUserById(4L, "4321");
            if (user.isPresent()) {
                System.out.println(user.get().toString());
            }
        } catch (IllegalAccessException e) {
            System.out.println("Catch");
            System.out.println(e.getMessage());
        }
        System.out.println("Continue working...");
    }
}
