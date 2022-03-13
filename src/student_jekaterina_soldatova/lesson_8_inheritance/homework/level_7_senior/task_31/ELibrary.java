package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class ELibrary {
    //- взять книгу из библиотеки; +
    //- вернуть книгу в библиотеку; +
    //- поиск нужной книги; +
    //- резервация книги; +
    //- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
    //- выписывание штрафов за вовремя не сданные книги;
    //- добавление новой книги в библиотеку. +

    void takeBook(Book thisBook, Client byClient) {
        thisBook.takeBook(byClient);
        byClient.takeBook(thisBook);
    }

    void returnBook(Book thisBook, Client byClient) {
        thisBook.returnBook(byClient);
        byClient.returnBook(thisBook);
    }

    void reserveBook(Book thisBook, Client byClient) {
        thisBook.reserveBook(byClient);
        byClient.reserveBook(thisBook);
    }

    boolean findBook(Book[] allBooks, String title) {
        for (Book book: allBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    Object[] addNewBook(Book[] allBooks, Book newBook) {
        return ELibraryUtil.addToArray(newBook, allBooks);
    }
}
