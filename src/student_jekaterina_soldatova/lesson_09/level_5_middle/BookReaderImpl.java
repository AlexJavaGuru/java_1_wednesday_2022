package student_jekaterina_soldatova.lesson_09.level_5_middle;

class BookReaderImpl implements BookReader {
    Book[] bookArray;

    BookReaderImpl (Book[] bookArray) {
        this.bookArray = bookArray;
    }

    void run(Book book) {
        if (isNewBookUnique(book) && isBookInfoNotEmpty(book)) {
            addNewBook(book);
        } else {
            if (isNewBookUnique(book)) {
                System.out.println("The book is already in the library");
            } else {
                System.out.println("The book info in not correct, please add");
                if (book.getTitle().equals("")) {
                    System.out.print(" title");
                }
                if (book.getAuthor().equals("")) {
                    System.out.print(" author");
                }
            }
        }
    }

    @Override
    public void addNewBook(Book book) {
        Book[] newBookArray = new Book[bookArray.length+1];
        System.arraycopy(bookArray, 0, newBookArray, 0, bookArray.length);
        newBookArray[newBookArray.length-1] = book;
        bookArray = newBookArray;
    }

    @Override
    public boolean isNewBookUnique(Book book) {
        if (bookArray != null) {
            for (Book item : bookArray) {
                if (item.getTitle().equals(book.getTitle()) || item.getAuthor().equals(book.getAuthor())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isBookInfoNotEmpty(Book book) {
        return !book.getTitle().equals("") && !book.getAuthor().equals("");
    }
}
