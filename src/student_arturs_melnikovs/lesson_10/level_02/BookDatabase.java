package student_arturs_melnikovs.lesson_10.level_02;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
