package student_aleksandrs_korsaks.ak_lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        System.out.println(list);

//        добавить в список элемент (в начало и в конец)
        list.add(0, 10);
        list.add(3, 13);
        System.out.println(list);
//        узнать длину списка
        int size = list.size();
        System.out.println(size);
//        удалить элемент из списка (по индексу и без)
        list.remove(0);
        Integer intToRemove = 13;
        list.remove(intToRemove);
        System.out.println(list);
//        узнать пустой список или нет
        boolean listEmpty = list.isEmpty();
        System.out.println(listEmpty);
//        обойти список и вывести на консоль каждый элемент.
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
