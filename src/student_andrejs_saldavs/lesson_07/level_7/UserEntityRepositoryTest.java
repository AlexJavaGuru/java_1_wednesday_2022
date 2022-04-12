package student_andrejs_saldavs.lesson_07.level_7;

import java.util.Arrays;

class UserEntityRepositoryTest {

    public static void main(String[] args) {
        UserEntityRepositoryTest userEntityRepositoryTest = new UserEntityRepositoryTest();
        userEntityRepositoryTest.saveUserTest();
        userEntityRepositoryTest.testGetUserFromName();
        userEntityRepositoryTest.testGetUserFromID();
    }

    public void saveUserTest() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity(1, "John", "Smith", "190489-95823");
        UserEntity user2 = new UserEntity(2, "Dave", "Walberg", "030191-85724");
        UserEntity user3 = new UserEntity(3, "Lucas", "Wagner", "281090-41109");
        test.saveNewUser(user1);
        test.saveNewUser(user2);
        test.saveNewUser(user3);

        UserEntity[] expectedResult = {user1, user2, user3};
        UserEntity[] actualResult = test.returnAllUsers();
        checkResult(expectedResult, actualResult, "Users saving test 1");
    }

    public void testGetUserFromID() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity(1, "John", "Smith", "190489-95823");
        UserEntity user2 = new UserEntity(2, "Dave", "Walbers", "030191-85724");
        test.saveNewUser(user1);
        test.saveNewUser(user2);

        UserEntity actualResult = test.getUserFromId(2);
        checkResult(user2, actualResult, "Get user from ID test 1");
    }

    public void testGetUserFromName() {
        UserEntityRepository test = new UserEntityRepository();
        UserEntity user1 = new UserEntity(1, "John", "Smith", "190489-95823");
        UserEntity user3 = new UserEntity(3, "Lucas", "Wagner", "281090-41109");
        test.saveNewUser(user1);
        test.saveNewUser(user3);

        UserEntity actualResult = test.getUserFromName("Lucas", "Wagner");
        checkResult(user3, actualResult, "Get user from name test 1");

    }

    void checkResult(UserEntity[] expectedResult, UserEntity[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + Arrays.toString(expectedResult) + " but actual is " + Arrays.toString(actualResult));
        }
    }

    void checkResult(UserEntity expectedResult, UserEntity actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }


}
