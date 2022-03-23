package student_jekaterina_soldatova.lesson_09.level_5_middle;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();

        test.checkNewIsNewEmptyLibrary();
        test.checkNewIsNewFilledLibrary();
        test.checkNewIsAdded();
        test.addNew();
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
        Book[] realResult = new Book[]{new Book("gjhk", "dtyfg")};

        BookReaderImpl bookReader = new BookReaderImpl(realResult);
        bookReader.addNewBook(new Book("someone", "something"));

        if (compareArrays(expectedResult, realResult)) {
            System.out.println("add new - ok");
        } else {
            System.out.println("add new - fail");
        }

    }

    static Boolean compareArrays(Book[] expected, Book[] real) {
        for (int i = 0; i < real.length; i++) {
            if (!(expected[i].getTitle().equals(real[i].getTitle()))) {
                return false;
            }
        }
        return true;
    }
}
