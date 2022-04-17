package student_igors.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.testIsEven();
    }

    public void testIsEven() {
        int even = 22;
        NumberUtils subject = new NumberUtils();
        boolean actualResult = subject.isEven(even);
        checkResult(actualResult, "If even test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " Passed");
        } else {
            System.out.println(testName + " Failed");
        }
    }
}




//   Напишите тесты для проверки метода isEven(int number).
//      Упростите работу метода, код внутри может быть написан в одну строку.