package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyListDemo {
    public static void main(String[] args) {

        MyListImpl myList = new MyListImpl();
        for (int i = 0; i < 5; i++) {
            myList.addElement(new Man(i + " Aleks"));
        }
        boolean result = myList.addElementInPosition(new Man("Petr"), 2);
        System.out.println(result);
        myList.addElement(new Man(" Gavr"));
        myList.addElement(new Man(" Gavr"));
        myList.addElement(new Man(" Gavr"));
        myList.addElement(new Man(" Gavr"));
        myList.addElement(new Man(" Gavr"));
        System.out.println(Arrays.toString(myList.getObjects()));
        myList.removeElement(new Man(" Gavr"));
        System.out.println(Arrays.toString(myList.getObjects()));
        myList.removeElement(new Man("Petr"));
        System.out.println(Arrays.toString(myList.getObjects()));
        myList.removeElement(new Man("0 Aleks"));
        System.out.println(Arrays.toString(myList.getObjects()));
        myList.addElement(new Man(" Sobakevich"));
        System.out.println(Arrays.toString(myList.getObjects()));
        boolean result1 = myList.addElementInPosition(new Man("Ljeha"), 0);
        System.out.println(result1);
        myList.addElement(new Man(" Kulja"));
        System.out.println(Arrays.toString(myList.getObjects()));
        myList.removeElement(new Man(" Sobakevich"));
        System.out.println(Arrays.toString(myList.getObjects()));
        List<Man> manList = myList.copyRange(1, 4);
        System.out.println(manList.toString());
        List<Man> manList1 = myList.copyAll();
        System.out.println(manList1.toString());
    }
}
