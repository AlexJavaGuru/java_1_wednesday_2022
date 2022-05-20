package student_jekaterina_soldatova.lesson_09.level_1_intern;

import java.util.List;

interface MyList {

    void addNew(Object object); //adds new object to the list

    void addNewAtIndex(Object object, int index); //adds new object to the list at specific index

    void removeIndex(int index); //removes object at index from the list

    void removeInstance(Object object); //removes specific object from the list

    void sort(); //sorts the list in alphabetic/descending order

    void sortReverse(); //sorts the list in reverse alphabetic/ascending order

    void printList(); //prints the list

}
