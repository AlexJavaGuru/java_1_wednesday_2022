package student_aleksandrs_korsaks.ak_lesson_9.level_1;

import java.util.Arrays;

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
//        myList.removeElement(new Man(" Gavr"));
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
    }
}
