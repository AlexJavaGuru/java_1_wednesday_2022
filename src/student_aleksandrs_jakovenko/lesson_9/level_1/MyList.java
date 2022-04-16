package student_aleksandrs_jakovenko.lesson_9.level_1;

public interface MyList {

    int findMinNumber(int[] array); //найти минимальное значение
    int findMaxNumber(int[] array); //найти максимальное значение
    void deleteNumber(int[] array, int i); //удаляет число/элемент из массива под указанным индексом
    void sort(int[] array); //сортировка по возрастанию
    void getSize(int[] array); //узнать размер массива
}
