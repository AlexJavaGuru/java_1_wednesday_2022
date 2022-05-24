package student_andrejs_saldavs.lesson_07.level_7;

class UserEntityRepository {

    private int userId;
    private UserEntity[] savedUsersArray;

    public void saveNewUser(UserEntity userToSave) {
        userId++;
        UserEntity[] copy = new UserEntity[userId];
        if(userId == 1) {
            copy[0] = userToSave;
            savedUsersArray = copy;
        } else {
            for (int i = 0; i < savedUsersArray.length; i++) {
                copy[i] = savedUsersArray[i];
            }
            copy[userId - 1] = userToSave;
            savedUsersArray = copy;
        }
    }

    public UserEntity getUserFromName(String firstName, String lastName) {
        for (int i = 0; i < savedUsersArray.length; i++) {
            if (firstName.equals(savedUsersArray[i].getFirstName()) && lastName.equals(savedUsersArray[i].getLastName())) {
                return savedUsersArray[i];
            }
        }
        System.out.println("User not found");
        return null;
    }

    public UserEntity getUserFromId(int id) {
        for (int i = 0; i < savedUsersArray.length; i++) {
            if (id == savedUsersArray[i].getId()) {
                return savedUsersArray[i];
            }
        }
        System.out.println("User not found");
        return null;
    }

    public UserEntity[] returnAllUsers() {
        return savedUsersArray;
    }

}
