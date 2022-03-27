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
            if (!isNewBookUnique(book)) {
                System.out.println("The book is already in the library");
            } else {
                System.out.print("The book info in not correct, please add");
                if (book.getTitle().equals("")) {
                    System.out.println(" title");
                }
                if (book.getAuthor().equals("")) {
                    System.out.println(" author");
                }
            }
        }
    }

    @Override
    public void addNewBook(Book book) {
        if (isNewBookUnique(book)) {
            Book[] newBookArray = new Book[bookArray.length + 1];
            System.arraycopy(bookArray, 0, newBookArray, 0, bookArray.length);
            newBookArray[newBookArray.length - 1] = book;
            bookArray = newBookArray;
        }
    }

    @Override
    public void removeBook(Book book) {
        if (isBookToRemoveInLibrary(book)) {
            Book[] newBookArray = new Book[bookArray.length - 1];

            int j = 0;
            for (Book item : bookArray) {
                if (!item.getAuthor().equals(book.getAuthor()) && !item.getTitle().equals(book.getTitle())) {
                    newBookArray[j] = item;
                    j++;
                }
            }
            bookArray = newBookArray;
        }
    }

    @Override
    public boolean isBookToRemoveInLibrary(Book book) {
        for (Book item: bookArray) {
            if (item.getTitle().equals(book.getTitle()) && item.getAuthor().equals(book.getAuthor())) {
                return true;
            }
        }
        System.out.println("No such book to remove");
        return false;
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
