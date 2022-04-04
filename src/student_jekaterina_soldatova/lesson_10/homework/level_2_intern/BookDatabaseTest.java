package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.*;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();

        test.addBook();
        test.deleteById();
        test.deleteBook();
        test.findByID();
        test.findByAuthor();
        test.findByTitle();
        test.countAllBooks();
        test.deleteByAuthor();
        test.deleteByTitle();
        test.findUniqueAuthors();
    }

    void addBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book ("smne", "smth"));

        database.save(new Book("smne", "smth"));
        List<Book> realResult = database.getBookList();

        // print(database);

        if (compare(expectedResult, realResult)) {
            System.out.println("save - ok");
        } else {
            System.out.println("save - fail");
        }
    }

    void deleteById() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne2", "smth2"));

        // print(database);

        if (database.delete(3L)) {
            System.out.println("delete by id - ok");
        } else {
            System.out.println("delete by id - fail");
        }
    }

    void deleteBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book ("smne", "smth"));

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne2", "smth2"));

        database.delete(new Book("smne2", "smth2"));
        List<Book> realResult = database.getBookList();

        // print(database);

        if (compare(expectedResult, realResult)) {
            System.out.println("delete book - ok");
        } else {
            System.out.println("delete book - fail");
        }
    }

    void findByID() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book("author", "title"));
        database.save(new Book("author2", "title2"));

        // print(database);

        Optional<Book> expectedResult = Optional.of(new Book("author", "title"));

        Optional<Book> realResult = database.findById(6L);

        if (expectedResult.get().getTitle().equals(realResult.get().getTitle()) &&
                expectedResult.get().getAuthor().equals(realResult.get().getAuthor())) {
            System.out.println("find by id - ok");
        } else {
            System.out.println("find by id - fail");
        }
    }

    void findByAuthor() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("author", "title"));
        database.save(new Book("author", "smth"));
        database.save(new Book("author2", "title2"));

        // print(database);

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book("author", "title"));
        expectedResult.add(new Book("author", "smth"));

        List<Book> realResult = database.findByAuthor("author");

        if (compare(expectedResult, realResult)) {
            System.out.println("find by author - ok");
        } else {
            System.out.println("find by author - fail");
        }
    }

    void findByTitle() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("author", "title"));
        database.save(new Book("author", "smth"));
        database.save(new Book("author2", "title"));

        // print(database);

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book("author", "title"));
        expectedResult.add(new Book("author2", "title"));

        List<Book> realResult = database.findByTitle("title");

        if (compare(expectedResult, realResult)) {
            System.out.println("find by title - ok");
        } else {
            System.out.println("find by title - fail");
        }
    }

    void countAllBooks() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("author", "title"));
        database.save(new Book("author", "smth"));
        database.save(new Book("author2", "title2"));

        int expectedResult = 3;

        if (database.countAllBooks() == expectedResult) {
            System.out.println("count - ok");
        } else {
            System.out.println("count - fail");
        }
    }

    void deleteByAuthor() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne", "smth2"));
        database.save(new Book ("smne2", "smth2"));

        database.deleteByAuthor("smne");

//        print(database);

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book("smne2", "smth2"));

        if (compare(expectedResult, database.getBookList())) {
            System.out.println("delete by author - ok");
        } else {
            System.out.println("delete by author - fail");
        }
    }

    void deleteByTitle() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne", "smth2"));
        database.save(new Book ("smne2", "smth2"));

        database.deleteByTitle("smth2");

//        print(database);

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book("smne", "smth"));

        if (compare(expectedResult, database.getBookList())) {
            System.out.println("delete by title - ok");
        } else {
            System.out.println("delete by title - fail");
        }
    }

    void findUniqueAuthors() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("smne");
        expectedResult.add("smne2");

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne2", "smth2"));
        database.save(new Book ("smne2", "smth3"));

        Set<String> realResult = database.findUniqueAuthors();

        if (expectedResult.equals(realResult)) {
            System.out.println("find unique authors - ok");
        } else {
            System.out.println("find unique authors - fail");
        }
    }

    boolean compare(List<Book> expected, List<Book> real) {
        for (int i = 0; i < real.size(); i++) {
            if (!(expected.get(i).getTitle().equals(real.get(i).getTitle())
                    && expected.get(i).getAuthor().equals(real.get(i).getAuthor()))) {
                return false;
            }
        }
        return true;
    }

    void print(BookDatabaseImpl database) {
        for (Book book: database.getBookList()) {
            System.out.print(book.getAuthor() + " " + book.getTitle() + " " + book.getId() + ", ");
        }
    }
}
