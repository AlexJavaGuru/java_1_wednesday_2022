package student_jekaterina_soldatova.lesson06.level01;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();

        numberUtilsTest.isEven();
        numberUtilsTest.isOdd();
    }

    void isEven() {
        int number = 10;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = FAIL");
        }
    }


    void isOdd() {
        int number = 11;
        boolean expectedResult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is odd test = OK");
        } else {
            System.out.println("Is odd test = FAIL");
        }
    }
}
