package student_aleksandr_zuk.lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        NumberUtilsTest.isEvenTest();

    }

    public static void isEvenTest(){
        boolean expetedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(2);
        if (realResult == expetedResult){
            System.out.println("Is Even test is OK");
        } else {
            System.out.println("Is Even test FAILED");
        }
    }


}
