package student_aleksandrs_jakovenko.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest1();
        numberUtilsTest.isEvenTest2();
    }

    public void isEvenTest1(){
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(6);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void isEvenTest2(){
        boolean expectedResult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(5);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
}
