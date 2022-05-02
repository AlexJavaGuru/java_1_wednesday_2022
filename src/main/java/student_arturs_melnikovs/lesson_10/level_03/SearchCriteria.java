package student_arturs_melnikovs.lesson_10.level_03;

import student_arturs_melnikovs.lesson_10.level_02.Book;

import java.util.function.Predicate;

public interface SearchCriteria extends Predicate<Book> {
    boolean test(Book book);
}
