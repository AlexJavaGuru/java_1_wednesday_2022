package teacher.lesson_9_interfaces.lessoncode.bookssystem;

import java.util.List;

public class Library {

    private List<Book> books;
    private List<ReaderCard> readerCards;
    private List<Reservation> reservations;

    public void takeTheBook(ReaderCard readerCard, String title) {

    }

    public void takeTheBook(ReaderCard readerCard, Book book) {
        if (readerCards.contains(readerCard) && isBookAvailable(book)) {
            for (ReaderCard card : readerCards) {
                if (card.getId().equals(readerCard.getId())) {
                    card.assignBookToTheCard(book);
                }
            }
        }
    }

    private boolean isBookAvailable(Book bookToCheck) {
        for (Book book : books) {
            if (book.equals(bookToCheck) && book.isNotTaken()) {
                return true;
            }
        }
        return false;
    }

}
