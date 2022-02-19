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
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
    return numbers;
    }
}
