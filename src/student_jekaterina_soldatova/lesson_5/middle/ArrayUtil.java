/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Напишите реализацию !!!
    }

}
 */
package student_jekaterina_soldatova.lesson_5.middle;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
}
