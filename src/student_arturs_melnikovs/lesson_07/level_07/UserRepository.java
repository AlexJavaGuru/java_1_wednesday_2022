package student_arturs_melnikovs.lesson_07.level_07;

class UserRepository {

    private int id;
    private UserEntity[] savedUsers;

    public void saveUser(UserEntity userToSave) {
        id++;
        UserEntity[] copy = new UserEntity[id];
        if(id == 1) {
            copy[0] = userToSave;
            savedUsers = copy;
        } else if (!isUserUnique(userToSave)) {
            System.out.println("User with same personal code or ID is already registered!");
            id--;
        } else {
            for (int i = 0; i < savedUsers.length; i++) {
                copy[i] = savedUsers[i];
            }
            copy[id - 1] = userToSave;
            savedUsers = copy;
        }
    }

    public void editUser(UserEntity userToEdit, int editedID, String editedFirstName, String editedLastName, String editedPersonalCode) {
        for (int i = 0; i < savedUsers.length; i++) {
            if (userToEdit.equals(savedUsers[i])) {
                savedUsers[i].setId(editedID);
                savedUsers[i].setFirstName(editedFirstName);
                savedUsers[i].setLastName(editedLastName);
                savedUsers[i].setPersonalCode(editedPersonalCode);
                break;
            } else if (i == savedUsers.length - 1) {
                System.out.println("User not found");
            }
        }
    }

    public void deleteUser(UserEntity userToDelete) {
        for (int i = 0; i < savedUsers.length; i++) {
            if (userToDelete.equals(savedUsers[i])) {
                savedUsers[i] = null;
                break;
            } else if (i == savedUsers.length -1) {
                System.out.println("User not found!");
            }
        }
    }

    public UserEntity getUserFromID(int id) {
        for (int i = 0; i < savedUsers.length; i++) {
            if (id == savedUsers[i].getId()) {
                return savedUsers[i];
            }
        }
        System.out.println("User not found");
        return null;
    }

    public UserEntity getUserFromName(String firstName, String lastName) {
        for (int i = 0; i < savedUsers.length; i++) {
            if (firstName.equals(savedUsers[i].getFirstName()) && lastName.equals(savedUsers[i].getLastName())) {
                return savedUsers[i];
            }
        }
        System.out.println("User not found");
        return null;
    }

    public UserEntity[] getAllUsers() {
        return savedUsers;
    }

    public boolean isUserUnique (UserEntity user) {
        int userID = user.getId();
        String userPersonalCode = user.getPersonalCode();
        for (int i = 0; i < savedUsers.length; i++) {
            if (userID == savedUsers[i].getId() || userPersonalCode.equals(savedUsers[i].getPersonalCode())) {
                return false;
            }
        }
        return true;
    }

}
