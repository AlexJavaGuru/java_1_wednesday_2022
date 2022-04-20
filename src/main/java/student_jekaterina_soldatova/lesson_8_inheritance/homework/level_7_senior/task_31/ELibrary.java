package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

import java.util.Date;

class ELibrary {

    //remove 1 unit of this book from library; add this book to the client's book list + date when was taken
    void takeBook(Book thisBook, Client byClient, Date dateWhenTaken) {
        thisBook.takeBook(byClient);
        byClient.takeBook(thisBook, dateWhenTaken);
    }

    //add 1 unit of this book to library; remove this book from the client's book list + check if late + return fine
    double returnBook(Book thisBook, Client byClient) {
        thisBook.returnBook(byClient);
        return ELibraryUtil.returnBookCheckIfFine(byClient, thisBook);
    }

    //add the client to the list who reserved this book; add this book to the reserved list of books of this client
    void reserveBook(Book thisBook, Client byClient) {
        thisBook.reserveBook(byClient);
        byClient.reserveBook(thisBook);
    }

    //find if book library has the book
    boolean findBook(Book[] allBooks, String title) {
        for (Book book: allBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    //send status to the client
    void sendNotification(Client client) {
        System.out.println("Dear " + client.getClientName() +"!");
        System.out.println("You have taken following books:");
        Object[][] booksTaken = client.getBooksTakenByThisClient();
        for (Object[] objects : booksTaken) {
            System.out.println(objects[1] + ": " + objects[0] + "; please return it until " + objects[2]);
        }
    }

    //add new book to library
    void addNewBook(Book[] allBooks, Book newBook) {
        ELibraryUtil.addToArray(newBook, allBooks);
    }

    //add new client to the client list
    void addNewClient(Client[] allClients, Client newClient) {
        ELibraryUtil.addToArray(newClient, allClients);
    }
}
