package student_aleksandrs_korsaks.ak_lesson_7.level_7;

import java.util.ArrayList;
import java.util.List;

class UserRepository {

    long userIdCounter = 1;

    List<UserEntity> usersList = new ArrayList<>();

    void saveUser(UserEntity user) {
        if (isPersonalCodeUniqueForUser(user.getPersonalCode())) {
            user.setId(userIdCounter++);
            usersList.add(user);
        } else {
            System.out.println("Can`t save: " + user.getUserName() + " " + user.getUserSurname() + " " + user.getPersonalCode() + "\n" + "The user with same personal code already exist in Data Base" + "\n");
        }
    }

    List<UserEntity> getAllUsers() {
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

    void checkUserThanEdit(long idForUserToEdit, String userName, String userSurname, String personalCode) {
        boolean idForUserToEditIsFounded = false;
        for (UserEntity user : usersList) {
            if (user.getId() == idForUserToEdit) {
                idForUserToEditIsFounded = true;
                editUser(user, userName, userSurname, personalCode);
            }
        }
        if (!idForUserToEditIsFounded) {
            System.out.println("\n" + "Can`t edit. There is no user with ID nr.: " + idForUserToEdit + "\n");
        }
    }

    void checkUserThanDelete(long idForUserToDelete) {
        boolean idForUserToDeleteIsFounded = false;
        for (UserEntity user : usersList) {
            if (user.getId() == idForUserToDelete) {
                idForUserToDeleteIsFounded = true;
                usersList.remove(user);
                break;
            }
        }
        if (!idForUserToDeleteIsFounded) {
            System.out.println("\n" + "Can`t delete. There is no user with ID nr.: " + idForUserToDelete + "\n");
        }
    }

    private void editUser(UserEntity user, String userName, String userSurname, String personalCode) {
        if (isPersonalCodeUniqueForUser(user, personalCode)) {
            user.setUserName(userName);
            user.setUserSurname(userSurname);
            user.setPersonalCode(personalCode);
        } else {
            System.out.println("\n" + "Can`t edit: " + user + "The user with same personal code already exist in Data Base" + "\n");
        }
    }

    boolean isPersonalCodeUniqueForUser(String personalCodeToCheck) {
        for (UserEntity user : usersList) {
            if (user.getPersonalCode().replaceAll("[^0-9]", "").equals(personalCodeToCheck.replaceAll("[^0-9]", ""))) {
                return false;
            }
        }
        return true;
    }

    boolean isPersonalCodeUniqueForUser(UserEntity userToCheck, String personalCode) {
        for (UserEntity user : usersList) {
            if (user.getId() != userToCheck.getId()) {
                if (user.getPersonalCode().replaceAll("[^0-9]", "").equals(personalCode.replaceAll("[^0-9]", ""))) {
                    return false;
                }
            }
        }
        return true;
    }
}


