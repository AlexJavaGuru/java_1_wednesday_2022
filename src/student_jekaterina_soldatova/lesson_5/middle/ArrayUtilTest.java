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
    }

    void shouldCreateArray() {
        int number = 7;
        int expectedResult = 7;
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.createArray(number).length;
        if (realResult == expectedResult) {
            System.out.println("array length = OK");
        } else {
            System.out.println("array length = FAIL");
        }
    }
}
