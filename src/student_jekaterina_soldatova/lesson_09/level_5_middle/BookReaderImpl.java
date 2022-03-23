package student_jekaterina_soldatova.lesson_09.level_5_middle;

import java.lang.reflect.Array;

class BookReaderImpl implements BookReader {
    Book[] bookArray;

    BookReaderImpl (Book[] bookArray) {
        this.bookArray = bookArray;
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
}
