package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.List;
import java.util.Optional;

public interface MyList {

    void addElement(Man objectToAdd);
    //    добавить элемент в список (в первое свободное место)

    boolean addElementInPosition(Man objectToAdd, int position);
    //    добавить элемент в список (в определённую позицию)
    //    возвращает true, если удалось (если индекс позиция не за пределами списка), false (если за пределами)

    void removeElement(Man object);
    //    удалить (конкретный (-ые)) элемент (-ы) из списка

    List<Man> copyRange(int startPosition, int endPosition);
    //    скопировать часть списка (с определённой позиции по определённую позицию) и вернуть в виде списка

    List<Man> copyAll();
    //    скопировать список целиком в другой список

}
