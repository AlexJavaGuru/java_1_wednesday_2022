package student_arturs_melnikovs.lesson_03.level_05;

public class DogTest {

    public static void main(String[] args) {
        DogTest test = new DogTest();

        test.checkDogAgeGoesOnAndOn();
    }

    private void checkDogAgeGoesOnAndOn() {
        Dog subject = new Dog("Sharik", 5,"Red");
        subject.happyBirthday();
        subject.happyBirthday();
        subject.happyBirthday();
        int expectedResult = 8;
        int actualResult = subject.age;
        checkResult(expectedResult, actualResult, "Test 1");
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
