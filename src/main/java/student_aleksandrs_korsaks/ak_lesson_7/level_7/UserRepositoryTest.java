package student_aleksandrs_korsaks.ak_lesson_7.level_7;

public class UserRepositoryTest {


    public static void main(String[] args) {
        UserRepositoryTest userRepositoryTest = new UserRepositoryTest();
        userRepositoryTest.shouldSaveUserTest();
        userRepositoryTest.shouldNotSaveUserNonUniquePersonalCodeTest();
        userRepositoryTest.shouldIncrementIdThanSaveUserTest();
        userRepositoryTest.shouldGetUsersByIdTest();
        userRepositoryTest.shouldGetUsersByIdNegativeTest();
        userRepositoryTest.shouldGetUsersByNameTest();
        userRepositoryTest.shouldGetUsersByNameNegativeTest();
        userRepositoryTest.shouldNotEditUserNoSuchIdTest();
        userRepositoryTest.shouldNotEditUserPersonalCodeAlreadyExistTest();
        userRepositoryTest.shouldEditUserTest();
        userRepositoryTest.shouldDeleteUserTest();
        userRepositoryTest.shouldNotDeleteUserNoSuchIdTest();

    }

    public void shouldSaveUserTest() {
        UserRepository userRepository = new UserRepository();
        boolean expectedResultBeforeSaving = userRepository.usersList.isEmpty();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        userRepository.saveUser(firstUser);
        boolean expectedResultAfterSaving = userRepository.usersList.isEmpty();
        checkTestResult("shouldSaveUserTest", expectedResultBeforeSaving && !expectedResultAfterSaving);
    }

    public void shouldNotSaveUserNonUniquePersonalCodeTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        userRepository.saveUser(firstUser);
        int expectedResultBeforeSaving = userRepository.usersList.size();
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10125");
        userRepository.saveUser(secondUser);
        int expectedResultAfterSaving = userRepository.usersList.size();
        checkTestResult("shouldNotSaveUserThanNonUniqueByPersonalCodeTest", (expectedResultBeforeSaving == 1) && (expectedResultAfterSaving == 1));
    }

    public void shouldIncrementIdThanSaveUserTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        UserEntity thirdUser = new UserEntity("Oksana", "Korsak", "200810-10129");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        long expectedResult = 3;
        long realResult = thirdUser.getId();
        checkTestResult("shouldIncrementIdThanSaveUserTest", expectedResult == realResult);
    }

    public void shouldGetUsersByIdTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        userRepository.saveUser(firstUser);
        UserEntity expectedResult = userRepository.usersList.get(0);
        UserEntity realResult = userRepository.getUsersById(1);
        checkTestResult("shouldGetUsersByIdTest", expectedResult.equals(realResult));
    }

    public void shouldGetUsersByIdNegativeTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        userRepository.saveUser(firstUser);
        UserEntity realResult = userRepository.getUsersById(2);
        checkTestResult("shouldGetUsersByIdNegativeTest", realResult == null);
    }

    public void shouldGetUsersByNameTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        UserEntity expectedResult = userRepository.usersList.get(1);
        UserEntity realResult = userRepository.getUsersByName("Mihail");
        checkTestResult("shouldGetUsersByNameTest", expectedResult.equals(realResult));
    }

    public void shouldGetUsersByNameNegativeTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        UserEntity realResult = userRepository.getUsersByName("Petr");
        checkTestResult("shouldGetUsersByNameNegativeTest", realResult == null);
    }

    public void shouldNotEditUserNoSuchIdTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        String expectedResultBeforeTryingToEdit = userRepository.usersList.toString();
        userRepository.checkUserThanEdit(3, "Oksana", "Korsak", "200810-10129");
        String expectedResultAfterTryingToEdit = userRepository.usersList.toString();
        checkTestResult("shouldNotEditUserNoUserWithThatIdTest", expectedResultBeforeTryingToEdit.equals(expectedResultAfterTryingToEdit));
    }

    public void shouldNotEditUserPersonalCodeAlreadyExistTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        UserEntity thirdUser = new UserEntity("Oksana", "Korsak", "200810-10129");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        UserEntity expectedResultBeforeTryingToEdit = userRepository.usersList.get(2);
        userRepository.checkUserThanEdit(3, "Oks", "Kor", "200810-10125");
        UserEntity expectedResultAfterTryingToEdit = userRepository.usersList.get(2);
        checkTestResult("shouldNotEditUserPersonalCodeAlreadyExistTest", expectedResultBeforeTryingToEdit.equals(expectedResultAfterTryingToEdit));
    }

    public void shouldEditUserTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        UserEntity thirdUser = new UserEntity("Oksana", "Korsak", "200810-10129");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        String expectedResult = "\n" + "User ID = 3, Name = " + "'" + "Oks" + "'" + ", Surname = " + "'" + "Kor" + "'" + ", Personal Code = " + "'" + "200810-10129" + "'" + "\n";
        String realResultBeforeEditing = userRepository.usersList.get(2).toString();
        userRepository.checkUserThanEdit(3, "Oks", "Kor", "200810-10129");
        String realResultAfterEditing = userRepository.usersList.get(2).toString();
        checkTestResult("shouldEditUserTest", !realResultBeforeEditing.equals(expectedResult) && realResultAfterEditing.equals(expectedResult));
    }

    public void shouldDeleteUserTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        UserEntity thirdUser = new UserEntity("Oksana", "Korsak", "200810-10129");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        userRepository.checkUserThanDelete(3);
        boolean realResultOne = userRepository.usersList.contains(thirdUser);
        int realResultTwo = userRepository.usersList.size();
        int expectedResultTwo = 2;
        checkTestResult("shouldDeleteUserTest", !realResultOne && realResultTwo == expectedResultTwo);
    }

    public void shouldNotDeleteUserNoSuchIdTest() {
        UserRepository userRepository = new UserRepository();
        UserEntity firstUser = new UserEntity("Aleks", "Korsak", "200810-10125");
        UserEntity secondUser = new UserEntity("Mihail", "Korsak", "200810-10120");
        UserEntity thirdUser = new UserEntity("Oksana", "Korsak", "200810-10129");
        userRepository.saveUser(firstUser);
        userRepository.saveUser(secondUser);
        userRepository.saveUser(thirdUser);
        int realResultBeforeDeleting = userRepository.usersList.size();
        userRepository.checkUserThanDelete(4);
        int realResultAfterDeleting = userRepository.usersList.size();
        int expectedResult = 3;
        checkTestResult("shouldNotDeleteUserNoSuchIdTest", (realResultBeforeDeleting == expectedResult) && (realResultAfterDeleting == expectedResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
