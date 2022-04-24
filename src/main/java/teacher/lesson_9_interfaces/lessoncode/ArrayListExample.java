package teacher.lesson_9_interfaces.lessoncode;

import teacher.lesson_9_interfaces.lessoncode.bookssystem.Book;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book());

        Map<Integer, String> basicMap = new HashMap<>();
        basicMap.put(1, "One");
        basicMap.put(2, "Two");
        basicMap.put(3, "Three");
        basicMap.put(4, "Four");

        System.out.println(basicMap.toString());

        String value = basicMap.get(4);

        Set<Map.Entry<Integer, String>> entries = basicMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        System.out.println(value);
    }
}
