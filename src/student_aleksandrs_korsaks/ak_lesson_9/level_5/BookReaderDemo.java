package student_aleksandrs_korsaks.ak_lesson_9.level_5;

class BookReaderDemo {
    public static void main(String[] args) {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean one = bookReader.addBook(new Book("John", "Potter2"));
        System.out.println(one);
        boolean two = bookReader.addBook(new Book("John", "Potter5"));
        System.out.println(two);
        boolean tree = bookReader.addBook(new Book("John1", "Potter2"));
        System.out.println(tree);
        boolean three = bookReader.deleteBook("potter3");
        System.out.println(three);
//        System.out.println(bookReader.getBookList().toString());
//        System.out.println(bookReader.getBookListInString().toString());
        System.out.println(bookReader.getAllBooksOfAuthor("John").toString());

    }
}
