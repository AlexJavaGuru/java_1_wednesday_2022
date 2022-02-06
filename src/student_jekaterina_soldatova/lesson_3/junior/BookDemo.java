package student_jekaterina_soldatova.lesson_3.junior;

class BookDemo {

    static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
