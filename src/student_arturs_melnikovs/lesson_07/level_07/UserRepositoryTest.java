package student_arturs_melnikovs.lesson_07.level_07;

import java.util.Arrays;

public class UserRepositoryTest {
    public static void main(String[] args) {
        UserRepositoryTest tester = new UserRepositoryTest();
        tester.testUserSavingV1();
        tester.testUserSavingV2();
        tester.testGetUserFromIDv1();
        tester.testGetUserFromIDv2();
        tester.testGetUserFromNameV1();
        tester.testGetUserFromNameV2();
        tester.testEditUserV1();
        tester.testEditUserV2();
        tester.testDeleteUserV1();
        tester.testDeleteUserV2();
    }

    public void testUserSavingV1() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        UserEntity testUser3 = new UserEntity(03, "Mister", "Twister", "123124");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.saveUser(testUser3);
        UserEntity[] expectedResult = {testUser1, testUser2, testUser3};
        UserEntity[] actualResult = repository.getAllUsers();
        checkResult(expectedResult, actualResult, "User saving test 1");
    }
    public void testUserSavingV2() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(01, "Olegs", "Melnikovs", "220595-11112");
        UserEntity testUser3 = new UserEntity(03, "Mister", "Twister", "123124");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.saveUser(testUser3);
        UserEntity[] expectedResult = {testUser1, testUser3};
        UserEntity[] actualResult = repository.getAllUsers();
        checkResult(expectedResult, actualResult, "User saving test 2");
    }
    public void testGetUserFromIDv1() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        UserEntity actualResult = repository.getUserFromID(02);
        checkResult(testUser2, actualResult, "Get user from ID test 1");
    }
    public void testGetUserFromIDv2() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        UserEntity actualResult = repository.getUserFromID(03);
        checkResult(actualResult, "Get user from ID test 2");
    }
    public void testGetUserFromNameV1() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        UserEntity actualResult = repository.getUserFromName("Olegs", "Melnikovs");
        checkResult(testUser2, actualResult, "Get user from name test 1");
    }
    public void testGetUserFromNameV2() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        UserEntity actualResult = repository.getUserFromName("Arturs", "Pirashkovs");
        checkResult(actualResult, "Get user from name test 2");
    }
    public void testEditUserV1() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.editUser(testUser1, 01, "Vasja", "Pupkin", "220595-11111");
        UserEntity expected = new UserEntity(01, "Vasja", "Pupkin", "220595-11111");
        checkResult(expected, testUser1, "Edit test 1");
    }
    public void testEditUserV2() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        UserEntity testUser3 = new UserEntity(03, "Mister", "Twister", "123124");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.editUser(testUser3, 04, "Vasja", "Pupkin", "220595-11116");
        UserEntity expected = new UserEntity(03, "Mister", "Twister", "123124");
        checkResult(expected, testUser3, "Edit test 2");
    }
    public void testDeleteUserV1() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        UserEntity testUser3 = new UserEntity(03, "Mister", "Twister", "123124");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.saveUser(testUser3);
        repository.deleteUser(testUser2);
        UserEntity[] expected = {testUser1, null, testUser3};
        UserEntity[] actual = repository.getAllUsers();
        checkResult(expected, actual, "Delete user test 1");
    }
    public void testDeleteUserV2() {
        UserRepository repository = new UserRepository();
        UserEntity testUser1 = new UserEntity(01, "Arturs", "Melnikovs", "220595-11111");
        UserEntity testUser2 = new UserEntity(02, "Olegs", "Melnikovs", "220595-11112");
        UserEntity testUser3 = new UserEntity(03, "Mister", "Twister", "123124");
        repository.saveUser(testUser1);
        repository.saveUser(testUser2);
        repository.deleteUser(testUser3);
        UserEntity[] expected = {testUser1, testUser2};
        UserEntity[] actual = repository.getAllUsers();
        checkResult(expected, actual, "Delete user test 2");
    }


    void checkResult(UserEntity[] expected, UserEntity[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    void checkResult(UserEntity expected, UserEntity actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    void checkResult(UserEntity actual, String testName) {
        if (actual == null) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
