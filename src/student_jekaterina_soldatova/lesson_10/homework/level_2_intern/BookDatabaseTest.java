package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();

        test.addBook();
        test.deleteById();
        test.deleteBook();
        test.findByID();
//        test.findByAuthor();
//        test.findByTitle();
//        test.countAllBooks();
//        test.deleteByAuthor();
//        test.deleteByTitle();
    }

    void addBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        List<Book> expectedResult = new LinkedList<>();
        expectedResult.add(new Book ("smne", "smth"));
     //   expectedResult.add(new Book ("smne2", "smth2"));

        database.save(new Book("smne", "smth"));
        List<Book> realResult = database.getBookList();

        print(database);

        if (compare(expectedResult, realResult)) {
            System.out.println(": save - ok");
        } else {
            System.out.println(": save - fail");
        }
    }

    void deleteById() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book ("smne", "smth"));
        database.save(new Book ("smne2", "smth2"));

        print(database);

        if (database.delete(3L)) {
            System.out.println(": delete by id - ok");
        } else {
            System.out.println(": delete by id - fail");
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

        print(database);

        if (compare(expectedResult, realResult)) {
            System.out.println(": delete book - ok");
        } else {
            System.out.println(": delete book - fail");
        }
    }

    void findByID() {
        BookDatabaseImpl database = new BookDatabaseImpl();

        database.save(new Book("author", "title"));
        database.save(new Book("author2", "title2"));
        print(database);
        Optional<Book> expectedResult = Optional.of(new Book("author", "title"));

        Optional<Book> realResult = database.findById(6L);

        if (expectedResult.get().getTitle().equals(realResult.get().getTitle()) &&
                expectedResult.get().getAuthor().equals(realResult.get().getAuthor())) {
            System.out.println("find by id - ok");
        } else {
            System.out.println("find by id - fail");
        }
    }


    boolean compare(List<Book> expected, List<Book> real) {
        for (int i = 0; i < real.size(); i++) {
            if (!(expected.get(i).getTitle().equals(real.get(i).getTitle())
                    && expected.get(i).getAuthor().equals(real.get(i).getAuthor()))) {
            //&& expected.get(i).getId().equals(real.get(i).getId())))
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
