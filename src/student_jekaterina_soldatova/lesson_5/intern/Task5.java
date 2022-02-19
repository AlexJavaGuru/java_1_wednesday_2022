/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition5 {

    public static void main(String[] args) {
        int numbers = {1, 2, 3, , };
    }

}

 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
    }
}
