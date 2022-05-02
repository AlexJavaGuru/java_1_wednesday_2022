package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.util.Map;

class ReaderTicket {
    private long readerTicketId;
    Reader reader;
    Map<Book, TimeManager> takenBooks;
    Map<Book, TimeManager> reservedBooks;

    public ReaderTicket() {
    }

    public ReaderTicket(Reader reader) {
        this.reader = reader;
    }

    void takeBook (Book takenBook){
//check what book isn`t reserved (method isBookReserved)
//        when
// add to Map "takenBooks" record about taken book and date/time it been taken
// + add deadline when should be returned
    }

    void returnBook (Book bookToReturn,  Map<Book, TimeManager> takenBooks){
//check what book in taken books list
//        when
// remove from Map "takenBooks" record
    }

    void reserveBook (Book takenBook){
//check what book isn`t taken (method isBookTaken)
//        when
// add to Map "reservedBooks" record about reservation of the book and date/time it been reserved
// + add deadline when reservation should be canceled
    }

    void unreserveBook (Book bookToReturn,  Map<Book, TimeManager> takenBooks){
//check what book in taken books list
//        when
// remove from Map "takenBooks" record
    }

    boolean isBookReserved (Book bookToCheck){
//        check what book isn`t reserved
        return true;
    }

    boolean isBookTaken (Book bookToCheck){
//        check what book isn`t taken
        return true;
    }

    boolean isTermsOutOfDeadline (Map<Book, TimeManager> recordsToCheck) {
// iterate throw Map and compare "currentDateAndTime" with "setDeadLine"
         return true;
    }

    void printOutOfDeadlineRecords (Map<Book, TimeManager> recordsToCheck) {
// iterate throw Map and compare "currentDateAndTime" with "setDeadLine"
// if out of deadline print record from Map;
    }

    int[] countPenalty (Map<Book, TimeManager> recordsToCheck) {
// isTermsOutOfDeadline
//        if so - when
// printOutOfDeadlineRecords
//        when
// calculate penalty (iterate throw Map and compare "currentDateAndTime" with "setDeadLine",
// difference write to array)
        return new int[0];
    }

    @Override
    public String toString() {
        return "ReaderTicket{" +
                "readerTicketId=" + readerTicketId +
                ", reader=" + reader +
                ", takenBooks=" + takenBooks +
                ", reservedBooks=" + reservedBooks +
                '}';
    }
}
