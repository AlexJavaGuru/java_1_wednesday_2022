package student_aleksandrs_korsaks.ak_lesson_7.level_7;

import java.util.ArrayList;

class UserRepository {

    static ArrayList<UserEntity> usersList = new ArrayList<>();

    void saveUser(UserEntity user) {
        usersList.add(user);
    }

    ArrayList getAllUsers() {
        return usersList;
    }

    UserEntity getUsersById(int userId) {
        for (UserEntity user : usersList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    UserEntity getUsersByName(String userName) {
        for (UserEntity user : usersList) {
            if (user.getUserName() == userName) {
                return user;
            }
        }
        return null;
    }
}
