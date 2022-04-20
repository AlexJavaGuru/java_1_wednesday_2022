package teacher.lesson_9_interfaces.lessoncode.bookssystem;

import java.util.List;

public class ReaderCard {

    private Long id;
    private Reader reader;
    private List<Book> takenBooks;
    private List<ReaderCardEntry> readerCardEntries;
    private List<Penalty> penalties;

    public void removeIfExists(Book book) {
        Book findBook = null;
        for (Book takenBook : takenBooks) {
            if (takenBook.equals(book)) {
                findBook = takenBook;
            }
        }
        takenBooks.remove(findBook);
    }

    public void assignBookToTheCard(Book book) {
        takenBooks.add(book);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }

    public List<ReaderCardEntry> getReaderCardEntries() {
        return readerCardEntries;
    }

    public void setReaderCardEntries(List<ReaderCardEntry> readerCardEntries) {
        this.readerCardEntries = readerCardEntries;
    }

    public List<Penalty> getPenalties() {
        return penalties;
    }

    public void setPenalties(List<Penalty> penalties) {
        this.penalties = penalties;
    }
}
