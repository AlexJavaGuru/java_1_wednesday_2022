package student_nadezda_travkina.lesson6_arrays_for_loop;

public class NumberUtilsTest {
    public static void main(String[] args) {

        NumberUtilsTest tester = new NumberUtilsTest();
        tester.isEvenTest();
    }

    public void isEvenTest() {
        int even = 18;

        NumberUtils subject = new NumberUtils();
        boolean expectedResult = even % 2 == 0;
        boolean actualResult = subject.isEven(12);
        if (expectedResult == actualResult) {
            System.out.println("NumberUtilsTest has passed");
        } else {
            System.out.println("NumberUtilsTest has failed");
        }
    }
}
