package student_arturs_melnikovs.lesson_09.level_05;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader{

    List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!hasTitleAndAuthor(book)) {
            return false;
        } else if (library.contains(book)) {
            return false;
        } else {
            library.add(book);
            return true;
        }
    }

    @Override
    public boolean hasTitleAndAuthor(Book book) {
        return book.getAuthor() != null && book.getTitle() != null;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (library.contains(book)) {
            library.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] getListOfAllBooks() {
        String[] listOfBooks = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            listOfBooks[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
        }
        return listOfBooks;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().startsWith(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().startsWith(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public boolean markAsRead(Book book) {
        if (library.contains(book)) {
            book.markAsRead();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean markAsUnread(Book book) {
        if (library.contains(book)) {
            book.markAsUnread();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<String> getListOfAllReadBooks() {
        List<String> listOfReadBooks = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).isRead())
            listOfReadBooks.add(library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]");
        }
        return listOfReadBooks;
    }

    @Override
    public List<String> getListOfAllUnreadBooks() {
        List<String> listOfUnreadBooks = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).isUnread())
                listOfUnreadBooks.add(library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]");
        }
        return listOfUnreadBooks;
    }
}
