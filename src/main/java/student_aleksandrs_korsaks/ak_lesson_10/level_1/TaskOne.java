package student_aleksandrs_korsaks.ak_lesson_10.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TaskOne {
    public static void main(String[] args) {

        List<String> demoArrayList = new ArrayList<>();
        demoArrayList.add("ArrayList is a best choice");
        demoArrayList.add(" if you need more often get some element from list, then add or delete it");

        System.out.println(demoArrayList);
        System.out.println(demoArrayList.get(0));

        List<String> demoLinkedList = new LinkedList<>();
        demoLinkedList.add("LinkedList is a best choice");
        demoLinkedList.add(" if you need more often add or delete some element from list, then get it");

        System.out.println(demoLinkedList);
        demoLinkedList.remove(1);
        System.out.println(demoLinkedList);

    }
}
