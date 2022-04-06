package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class ReaderTicket {
    private long readerTicketId;
    Reader reader;
    Map<Book, LocalDateTime> takenBooks = new HashMap<Book, LocalDateTime>();
    Map<Book, LocalDateTime> reservedBooks = new HashMap<Book, LocalDateTime>();

}
