package student_arturs_melnikovs.lesson_09.level_01;

interface MyList {

    void addElement(int valueToAdd); //добавляет элемент в конец списка
    void deleteLastElement(); //удаляет последний введёный элемент
    int getLength(); //возвращает длину списка
    void deleteElement(int index); //удаляет элемент на конкретной позиции
    void insertElement(int index); //вставляет элемент на конкретную позицию
    void sortAscending();//сортирует
    void sortDescending();
    int findMaxNumber();
    int findMinNumber();

}
