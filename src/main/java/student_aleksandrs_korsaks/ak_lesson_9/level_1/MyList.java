package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.List;

public interface MyList {

    void addElement(Object o);
    //    добавить элемент в список (после последнего)

    boolean addElementInPosition(Object o, int position);
    //    добавить элемент в список (в определённую позицию)
    //    возвращает true, если удалось (если позиция не занята), false (если позиция занята)

    void removeElement(Object o);
    //    удалить (конкретный) элемент из списка

    List<Object> copyRange(int startPosition, int endPosition);
    //    скопировать часть списка и вернуть в виде списка

    List<Object> copyAll();
    //    скопировать список целиком в другой список

/* добавлять такие методы как sort, findMax и findMin не стал, так как типы данных, поданные в список,
могут быть различны (в т.ч. и объекты) и непонятно по каким критериям (полям) работать этим методам
 */


}
