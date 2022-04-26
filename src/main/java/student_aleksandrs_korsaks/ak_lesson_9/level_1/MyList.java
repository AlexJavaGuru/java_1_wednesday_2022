package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.List;

public interface MyList {

    void addElement(Man objectToAdd);
    //    добавить элемент в список (после последнего)

    boolean addElementInPosition(Man objectToAdd, int position);
    //    добавить элемент в список (в определённую позицию)
    //    возвращает true, если удалось (если позиция не занята), false (если позиция занята)

    void removeElement(Man object);
    //    удалить (конкретный) элемент из списка

    List<Man> copyRange(int startPosition, int endPosition);
    //    скопировать часть списка и вернуть в виде списка

    List<Man> copyAll();
    //    скопировать список целиком в другой список

/* добавлять такие методы как sort, findMax и findMin не стал, так как типы данных, поданные в список,
могут быть различны (в т.ч. и объекты) и непонятно по каким критериям (полям) работать этим методам
 */


}
