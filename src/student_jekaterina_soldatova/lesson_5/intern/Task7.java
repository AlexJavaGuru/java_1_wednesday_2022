/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}

 */
package student_jekaterina_soldatova.lesson_5.intern;

class Task7 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[numbers.length-1]);
    }
}
