package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

import student_nikita_visnakov.nv_lesson2.SystemOut;

import java.util.Date;

class ELibrary {
    //- взять книгу из библиотеки; +
    //- вернуть книгу в библиотеку; +
    //- поиск нужной книги; +
    //- резервация книги; +
    //- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
    //- выписывание штрафов за вовремя не сданные книги;
    //- добавление новой книги в библиотеку. +

    void takeBook(Book thisBook, Client byClient, Date dateWhenTaken) {
        thisBook.takeBook(byClient);
        byClient.takeBook(thisBook, dateWhenTaken);
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

    void sendNotification(Client client) {
        System.out.println("Dear " + client.getClientName() +"!");
        System.out.println("You have taken following books:");
        Object[][] booksTaken = client.getBooksTakenByThisClient();
        for (Object[] objects : booksTaken) {
            System.out.println(objects[1] + ": " + objects[0] + "; please return it until " + objects[2]);
        }
    }

    void addNewBook(Book[] allBooks, Book newBook) {
        ELibraryUtil.addToArray(newBook, allBooks);
    }

    void addNewClient(Client[] allClients, Client newClient) {
        ELibraryUtil.addToArray(newClient, allClients);
    }
}
