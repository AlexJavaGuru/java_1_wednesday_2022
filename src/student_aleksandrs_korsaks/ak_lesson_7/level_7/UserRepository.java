package student_aleksandrs_korsaks.ak_lesson_7.level_7;

import java.util.ArrayList;

class UserRepository {

    static ArrayList<UserEntity> usersList = new ArrayList<>();

    boolean isUserUnique(UserEntity userToCheck) {
        for (UserEntity user : usersList) {
            if (user.getPersonalCode().replaceAll("[^0-9]", "").equals(userToCheck.getPersonalCode().replaceAll("[^0-9]", ""))) {
                return false;
            }
        }
        return true;
    }

    void saveUser(UserEntity user) {
        if (isUserUnique(user)) {
            usersList.add(user);
        } else {
            System.out.println("Can`t save (" + user +"\r" + ". The user with same personal code already exist in Data Base");
        }
    }

    ArrayList<UserEntity> getAllUsers() {
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
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}
