/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Напишите реализацию !!!
        // Проверьте, что метод создаёт массив указанной длины
    }

}
 */
package student_jekaterina_soldatova.lesson_5.middle;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        int number = 7;
        int expectedResult = 7;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(number);
        int realResult = array.length;
        if (realResult == expectedResult) {
            System.out.println("array length = OK");
        } else {
            System.out.println("array length = FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int expectedResult = 6;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[7];
        arrayUtil.fillArrayWithNumbers(array,7);
        int realResult = arrayUtil.findMaxNumber(array);
        if (realResult == expectedResult) {
            System.out.println("array max number = OK");
        } else {
            System.out.println("array max number = FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int expectedResult = 0;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[7];
        arrayUtil.fillArrayWithNumbers(array,7);
        int realResult = arrayUtil.findMinNumber(array);
        if (realResult == expectedResult) {
            System.out.println("array min number = OK");
        } else {
            System.out.println("array min number = FAIL");
        }
    }
}
