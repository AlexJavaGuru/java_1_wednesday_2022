package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

class Demo {

    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book one = new Book("A1", "B1","1990");
        Book two = new Book("A1", "B1","1990");

        bookDatabase.save(one);
        bookDatabase.save(two);

        System.out.println(bookDatabase.getBookList());
        System.out.println(bookDatabase.findUniqueBooks());
    }
}
