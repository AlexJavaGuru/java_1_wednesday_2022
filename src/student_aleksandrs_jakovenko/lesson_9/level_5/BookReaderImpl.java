package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<String> library = new ArrayList<>();

    @Override
    public boolean addBook(String bookName, String author) {
        String book = convertBook(bookName, author);
        if (bookName == "" || author == "") {
            return false;
        } else if (library.contains(book)) {
            return false;
        } else {
            library.add((book));
            return true;
        }
    }

//    String[] library = new String[0];
//
//    @Override
//    public boolean addBook(String bookName, String author) {
//        String book = convertBook(bookName, author);
//
//        for (int i = 0; i < library.length; i++) {
//            if (library.length == 0) {
//                library = new String[library.length + 1];
//                library[i] = book;
//            } else if (library[i].equals(book)) {
//                return false;
//            } else if (!library[i].equals(book)) {
//                library = new String[library.length + 1];
//                library[i] = book;
//            }
//        }
//        return true;
//    }

    public String convertBook(String bookName, String author) {
        return bookName + " " + author;
    }
}
