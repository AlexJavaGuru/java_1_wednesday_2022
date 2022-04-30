package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.util.List;

public class LibraryRepository {

    List<Book> listOfBooks;
    List<ReaderTicket> listOfReaderTickets;
    private long bookIdCounter = 0;
    private long readerIdCounter = 0;
    private long readerTicketIdCounter = 0;

    Book createBook (String bookAuthor, String bookTitle, boolean bookIsTaken, boolean bookIsReserved){
//        new Book (String bookAuthor, String bookTitle, boolean bookIsTaken, boolean bookIsReserved);
//        book.setBookId = bookIdCounter + 1;
        return null; //return book
    }

    Reader createReader (String readerName, String readerSurname, String readerPersonalCode, int readerPhoneNumber, String readerAddress){
//        new Reader ((String readerName, String readerSurname, String readerPersonalCode, int readerPhoneNumber, String readerAddress);
//        reader.setReaderId = readerIdCounter + 1;
        return null; //return reader
    }

    ReaderTicket createReaderTicket (){
       new ReaderTicket ();
//        reader.setReaderTicketId = readerTicketIdCounter + 1;
        return null; //return readerTicket
    }

    void addBook (Book book){
//        add book to "listOfBooks"
    }

    Book findBook (Book book, String nameOfBook){
// search by loop in list of books
        return book;
    }

    void addReaderTicket (ReaderTicket ticket){
//        add ticket to "listOfReaderTickets"
    }


}
