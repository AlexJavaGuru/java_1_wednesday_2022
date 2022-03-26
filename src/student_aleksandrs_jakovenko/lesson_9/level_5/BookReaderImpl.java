package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.Objects;

class BookReaderImpl implements BookReader {

    private String[] library = new String[0];

    @Override
    public boolean addBook(String bookName, String author) {
        String book = convertBook(bookName, author);
        library = new String[library.length + 1];
        for (int i = 0; i < library.length; i++) {
            if (Objects.equals(library[i], book)) {
                return false;
            } else
                library[i] = book;
        }
        return true;
    }

    public String convertBook(String bookName, String author) {
        return bookName + " " + author;
    }
}
