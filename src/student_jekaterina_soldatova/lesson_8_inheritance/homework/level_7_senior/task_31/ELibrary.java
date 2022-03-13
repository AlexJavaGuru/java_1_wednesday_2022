package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

import java.util.Arrays;

class ELibrary {
    //- взять книгу из библиотеки;
    //- вернуть книгу в библиотеку;
    //- поиск нужной книги;
    //- резервация книги;
    //- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
    //- выписывание штрафов за вовремя не сданные книги;
    //- добавление новой книги в библиотеку.

    //array of books: author, title, count of books, array[clients who took], array[clients who reserved]
    //array of clients: name, array[book taken, days taken], array[reserved books]
    //take book (array of books: count of books-1, array[clients who took]: +name OR array[clients who reserved]: +name)(array of clients:

    void takeBook(Book book, Client client) {
        book.takeBook(client);
        client.takeBook(book);
    }

    void returnBook(Book book, Client client) {
        book.returnBook(client);
        client.returnBook(book);
    }

    void reserveBook(Book book, Client client) {
        book.reserveBook(client);
        client.reserveBook(book);
    }

    void findBook() {

    }

    void addNewBook() {

    }
}
