package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

public class GetEachAuthorBookCount implements UIAction{
    private BookDatabase bookDatabase;

    public GetEachAuthorBookCount(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }
}
