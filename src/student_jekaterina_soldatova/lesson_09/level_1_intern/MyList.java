package student_jekaterina_soldatova.lesson_09.level_1_intern;

import java.util.List;

interface MyList {

    void addNew(Object object, List list); //adds new object to the list

    void addNewAtIndex(Object object, int index, List list); //adds new object to the list at specific index

    void removeIndex(int index, List list); //removes object at index from the list

    void removeInstance(Object object, List list); //removes specific object from the list

    void sort(List list); //sorts the list in alphabetic/descending order

    void sortReverse(List list); //sorts the list in reverse alphabetic/ascending order

    void printList(List list); //prints the list

}
