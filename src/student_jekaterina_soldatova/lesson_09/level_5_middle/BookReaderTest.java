package student_jekaterina_soldatova.lesson_09.level_5_middle;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();

        test.checkNewIsNewEmptyLibrary();
        test.checkNewIsNewFilledLibrary();
        test.checkNewIsAdded();

        test.addNew();

        test.titleAndAuthor();
        test.noTitleIsAuthor();
        test.isTitleNoAuthor();
        test.noTitleNoAuthor();

        test.checkRun();

        test.removeOk();
        test.removeNone();

        test.printBooks();

        test.findByAuthor();
        test.findByAuthorNone();

        test.findByTitle();
        test.findByTitleNone();
    }

    void checkNewIsNewEmptyLibrary() {
        BookReaderImpl bookReader = new BookReaderImpl(null);
        if (bookReader.isNewBookUnique(new Book("someone", "something"))) {
            System.out.println("check if new in empty library- ok");
        } else {
            System.out.println("check if new in empty library - fail");
        }
    }

    void checkNewIsNewFilledLibrary() {
        Book[] array = new Book[]{new Book("gjhk", "dtyfg")};
        BookReaderImpl bookReader = new BookReaderImpl(array);
        if (bookReader.isNewBookUnique(new Book("someone", "something"))) {
            System.out.println("check if new - ok");
        } else {
            System.out.println("check if new - fail");
        }
    }

    void checkNewIsAdded() {
        Book[] array = {new Book("gjhk", "dtyfg"), new Book("someone", "something")};
        BookReaderImpl bookReader = new BookReaderImpl(array);
        if (!bookReader.isNewBookUnique(new Book("someone", "something"))) {
            System.out.println("check if already added - ok");
        } else {
            System.out.println("check if already added - fail");
        }
    }

    void addNew() {
        Book[] expectedResult = {new Book("gjhk", "dtyfg"), new Book("someone", "something")};

        BookReaderImpl bookReader = new BookReaderImpl(new Book[]{new Book("gjhk", "dtyfg")});
        bookReader.addNewBook(new Book("someone", "something"));

        if (compareArrays(expectedResult, bookReader.bookArray)) {
            System.out.println("add new - ok");
        } else {
            System.out.println("add new - fail");
        }
    }

    void titleAndAuthor(){
        BookReaderImpl bookReader = new BookReaderImpl(null);
        if (bookReader.isBookInfoNotEmpty(new Book("someone", "something"))) {
            System.out.println("check book has both title-author - ok");
        } else {
            System.out.println("check book has both title-author - fail");
        }
    }

    void noTitleIsAuthor(){
        BookReaderImpl bookReader = new BookReaderImpl(null);
        if (!bookReader.isBookInfoNotEmpty(new Book("someone", ""))) {
            System.out.println("check book has only author - ok");
        } else {
            System.out.println("check book has only author - fail");
        }
    }

    void isTitleNoAuthor(){
        BookReaderImpl bookReader = new BookReaderImpl(null);
        if (!bookReader.isBookInfoNotEmpty(new Book("", "something"))) {
            System.out.println("check book has only title - ok");
        } else {
            System.out.println("check book has only title - fail");
        }
    }

    void noTitleNoAuthor(){
        BookReaderImpl bookReader = new BookReaderImpl(null);
        if (!bookReader.isBookInfoNotEmpty(new Book("", ""))) {
            System.out.println("check book has no author no title - ok");
        } else {
            System.out.println("check book has no author no title - fail");
        }
    }

    void checkRun() {
        Book[] expectedResult = {new Book("Gjhk", "dtyfg"), new Book("someone", "something")};
        Book[] realResult = new Book[]{new Book("Gjhk", "dtyfg")};

        BookReaderImpl bookReader = new BookReaderImpl(realResult);
        bookReader.run(new Book("someone", "something"));

        if (compareArrays(expectedResult, bookReader.bookArray)) {
            System.out.println("check run - ok");
        } else {
            System.out.println("check run - fail");
        }

    }

    void removeOk() {
        Book[] expectedResult = {new Book("gjhk", "dtyfg")};

        BookReaderImpl bookReader = new BookReaderImpl(new Book[]{new Book("gjhk", "dtyfg"), new Book("someone", "something")});
        bookReader.removeBook(new Book("someone", "something"));

        if (compareArrays(expectedResult, bookReader.bookArray)) {
            System.out.println("remove - ok");
        } else {
            System.out.println("remove - fail");
        }
    }

    void removeNone() {
        Book[] expectedResult = {new Book("gjhk", "dtyfg")};

        BookReaderImpl bookReader = new BookReaderImpl(expectedResult);
        bookReader.removeBook(new Book("someone", "something"));

        if (compareArrays(expectedResult, bookReader.bookArray)) {
            System.out.println("remove none - ok");
        } else {
            System.out.println("remove none - fail");
        }
    }

    void printBooks() {
        String[] expectedResult = {"title [author]", "something [someone]"};
        Book[] run = new Book[]{new Book("author", "title"), new Book("someone", "something")};

        BookReaderImpl bookReader = new BookReaderImpl(run);
        String[] realResult = bookReader.printCurrentBooks();

        if (compareArrays(expectedResult, realResult)) {
            System.out.println("check print - ok");
        } else {
            System.out.println("check print - fail");
        }
    }

    void findByAuthor() {
        Book[] testArray = {new Book("dthfj", "1"), new Book("blah", "1"), new Book("bla", "2"), new Book("fjgbmh", "2")};
        BookReaderImpl bookReader = new BookReaderImpl(testArray);

        Book[] expectedResult = {new Book("blah", "1"), new Book("bla", "2")};
        Book[] realResult = bookReader.findByAuthor("bl");

        if (compareArrays(expectedResult, realResult)) {
            System.out.println("find by author - ok");
        } else {
            System.out.println("find by author - fail");
        }
    }

    void findByAuthorNone() {
        Book[] testArray = {new Book("blah", "1"), new Book("blah", "2")};
        BookReaderImpl bookReader = new BookReaderImpl(testArray);

        Book[] realResult = bookReader.findByAuthor("fgguihiuhoi");

        if (realResult == null) {
            System.out.println("find by author none - ok");
        } else {
            System.out.println("find by author none - fail");
        }
    }

    void findByTitle() {
        Book[] testArray = {new Book("dthfj", "12345"), new Book("blah", "123"), new Book("bla", "s123"), new Book("fjgbmh", "2")};
        BookReaderImpl bookReader = new BookReaderImpl(testArray);

        Book[] expectedResult = {new Book("dthfj", "12345"), new Book("blah", "123")};
        Book[] realResult = bookReader.findByTitle("12");

        if (compareArrays(expectedResult, realResult)) {
            System.out.println("find by title - ok");
        } else {
            System.out.println("find by title - fail");
        }
    }

    void findByTitleNone() {
        Book[] testArray = {new Book("blah", "1"), new Book("blah", "2")};
        BookReaderImpl bookReader = new BookReaderImpl(testArray);

        Book[] realResult = bookReader.findByTitle("fgguihiuhoi");

        if (realResult == null) {
            System.out.println("find by title none - ok");
        } else {
            System.out.println("find by title none - fail");
        }
    }


    static Boolean compareArrays(Book[] expected, Book[] real) {
        if (expected.length == real.length) {
            for (int i = 0; i < expected.length; i++) {
                if (!(expected[i].getTitle().equals(real[i].getTitle())) || !(expected[i].getAuthor().equals(real[i].getAuthor()))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    static Boolean compareArrays(String[] expected, String[] real) {
        if (expected.length == real.length) {
            for (int i = 0; i < expected.length; i++) {
                if (!expected[i].equals(real[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
