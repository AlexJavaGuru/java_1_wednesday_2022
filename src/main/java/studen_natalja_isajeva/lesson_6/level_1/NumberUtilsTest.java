package studen_natalja_isajeva.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEven();
        numberUtilsTest.isNotEven();
    }

    void isEven() {
        int number = 4;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(number);
        if (result == expectedResult) {
            System.out.println("Even test PASSED!");
        } else {
            System.out.println("Even test FAILED!");
        }
    }
    void isNotEven() {
        int number = 3;
        boolean expectedResult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isEven(number);
        if (result == expectedResult) {
            System.out.println("Odd test PASSED!");
        } else {
            System.out.println("Odd test FAILED!");
        }
    }

}
