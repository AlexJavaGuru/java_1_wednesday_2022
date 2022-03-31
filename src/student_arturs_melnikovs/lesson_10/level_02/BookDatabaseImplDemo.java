package student_arturs_melnikovs.lesson_10.level_02;

class BookDatabaseImplDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        System.out.println(bookDatabase.save(book1));
        System.out.println(bookDatabase.save(book2));
    }
}
