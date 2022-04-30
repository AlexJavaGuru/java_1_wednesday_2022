package teacher.lesson_10_collections.lessoncode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> myTestArray = new ArrayList<>();

        myTestArray.add("ABC");
        myTestArray.add("DEF");
        myTestArray.add("G");
        myTestArray.add("G");

        System.out.println(myTestArray);
        System.out.println(myTestArray.size());
        myTestArray.remove("ABC");
        System.out.println(myTestArray);

        String item = myTestArray.get(2);
        System.out.println(item);

        for (String string : myTestArray) {
            System.out.println(string);
        }

        //Iterator...better not to use.
        Iterator<String> iterator = myTestArray.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        System.out.println(myTestArray.contains("G"));

    }
}
