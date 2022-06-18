package student_aleksandrs_korsaks.ak_lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class TaskTwo {
    public static void main(String[] args) {

//        так примитивы добавить не получится, так как List работает только с не примитивными значениями

//        List<int> myList = new ArrayList<int>();
//        int someInt = 1;
//        myList.add(someInt);


//        это можно сделать так

        int someInt = 1;
        List<Integer> list = new ArrayList<>();
        list.add(someInt);

        System.out.println(list.get(0));
    }
}
