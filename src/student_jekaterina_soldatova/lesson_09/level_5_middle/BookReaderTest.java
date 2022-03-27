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
        Book[] expectedResult = {new Book("gjhk", "dtyfg"), new Book("someone", "something")};
        Book[] realResult = new Book[]{new Book("gjhk", "dtyfg")};

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
}
