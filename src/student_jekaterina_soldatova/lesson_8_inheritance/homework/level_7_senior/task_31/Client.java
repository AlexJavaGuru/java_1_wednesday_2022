package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class Client {
    private String name;
    private String[] booksTaken;
    private String[] booksReserved;

    Client(String name, String[] booksTaken, String[] booksReserved) {
        this.name = name;
        this.booksTaken = booksTaken;
        this.booksReserved = booksReserved;
    }

    String getClientName() {
        return name;
    }

    String[] getBooksTaken() {
        return booksTaken;
    }

    String[] getBooksReserved() {
        return booksReserved;
    }

    void takeBook(Book book){
        String[] newBooksTakenList = new String[booksTaken.length+1];
        System.arraycopy(booksTaken, 0, newBooksTakenList, 0, booksTaken.length);
        newBooksTakenList[newBooksTakenList.length-1] = book.getTitle();
        booksTaken = newBooksTakenList;
    }

    void returnBook(Book book) {
        String[] newBooksTakenList = new String[booksTaken.length - 1];
        for (int i = 0, j = 0; i < booksTaken.length - 1; i++) {
            if (!(booksTaken[i].equals(book.getTitle()))) {
                newBooksTakenList[j++] = booksTaken[i];
            }
        }
        booksTaken = newBooksTakenList;
    }

    void reserveBook(Book book) {
        String[] newBooksReserved = new String[booksReserved.length+1];
        System.arraycopy(booksReserved, 0, newBooksReserved, 0, booksReserved.length);
        newBooksReserved[newBooksReserved.length-1] = book.getTitle();
        booksReserved = newBooksReserved;
    }
}
