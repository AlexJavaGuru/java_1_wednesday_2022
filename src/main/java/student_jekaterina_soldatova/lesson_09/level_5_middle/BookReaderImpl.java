package student_jekaterina_soldatova.lesson_09.level_5_middle;

class BookReaderImpl implements BookReader {
    Book[] bookArray;

    BookReaderImpl (Book[] bookArray) {
        this.bookArray = bookArray;
    }

    void run(Book book) {
        returnCurrentBooks();
        if (isNewBookUnique(book) && isBookInfoNotEmpty(book)) {
            addNewBook(book);
        } else {
            if (!isNewBookUnique(book)) {
                System.out.println("The book is already in the library");
            } else {
                System.out.print("The book info in not correct, please add");
                if (!book.getTitle().matches("[a-zA-Z_0-9]+")) {
                    System.out.print(" title");
                }
                if (!book.getAuthor().matches("[a-zA-Z]+")) {
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
    public String[] returnCurrentBooks() {
        String[] bookArrayToPrint = new String[bookArray.length];
        for (int i = 0; i < bookArray.length; i++) {
            bookArrayToPrint[i] = (bookArray[i].getTitle() + " [" + bookArray[i].getAuthor() + "]");
        }
        return bookArrayToPrint;
    }

    @Override
    public String[] returnReadBooks() {
        int i = 0;
        for (Book book: bookArray) {
            if (book.isRead) {
                i++;
            }
        }
        if (i > 0) {
            String[] readBooks = new String[i];
            i = 0;
            for (Book book : bookArray) {
                if (book.isRead) {
                    readBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                    i++;
                }
            }
            return readBooks;
        }
        return null;
    }

    @Override
    public String[] returnNotReadBooks() {
        int i = 0;
        for (Book book: bookArray) {
            if (!book.isRead) {
                i++;
            }
        }
        if (i > 0) {
            String[] readBooks = new String[i];
            i = 0;
            for (Book book : bookArray) {
                if (!book.isRead) {
                    readBooks[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                    i++;
                }
            }
            return readBooks;
        }
        return null;
    }

    @Override
    public Book[] findByAuthor(String author) {
        int i = 0;
        for (Book book: bookArray) {
            if (book.getAuthor().startsWith(author)) {
                i++;
            }
        }
        if (i > 0) {
            Book[] foundBooks = new Book[i];
            i = 0;
            for (Book book : bookArray) {
                if (book.getAuthor().startsWith(author)) {
                    foundBooks[i] = book;
                    i++;
                }
            }
            return foundBooks;
        }
        return null;
    }

    @Override
    public Book[] findByTitle(String title) {
        int i = 0;
        for (Book book: bookArray) {
            if (book.getTitle().startsWith(title)) {
                i++;
            }
        }
        if (i > 0) {
            Book[] foundBooks = new Book[i];
            i = 0;
            for (Book book : bookArray) {
                if (book.getTitle().startsWith(title)) {
                    foundBooks[i] = book;
                    i++;
                }
            }
            return foundBooks;
        }
        return null;
    }

    @Override
    public boolean isBookToRemoveInLibrary(Book book) {
        for (Book item: bookArray) {
            if (item.getTitle().equals(book.getTitle()) && item.getAuthor().equals(book.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isNewBookUnique(Book book) {
        if (bookArray != null) {
            for (Book item : bookArray) {
                if (item.getTitle().equals(book.getTitle()) && item.getAuthor().equals(book.getAuthor())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isBookInfoNotEmpty(Book book) {
        return book.getTitle().matches("[a-zA-Z_0-9]+") && book.getAuthor().matches("[a-zA-Z]+");
    }

    @Override
    public boolean changeBookStatusToRead(Book book) {
        if (!isNewBookUnique(book)) {
            book.isRead = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean changeBookStatusToNotRead(Book book) {
        if (!isNewBookUnique(book)) {
            book.isRead = false;
            return true;
        }
        return false;
    }
}
