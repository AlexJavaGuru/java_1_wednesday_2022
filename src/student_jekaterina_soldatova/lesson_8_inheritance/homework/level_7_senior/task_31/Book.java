package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class Book {
    private String title;
    private String author;
    private int countOfBooks;
    private String[] clientsWhoTook;
    private String[] clientsWhoReserved;

    Book(String title, String author, int countOfBooks, String[] clientsWhoTook, String[] clientsWhoReserved) {
        this.title = title;
        this.author = author;
        this.countOfBooks = countOfBooks;
        this.clientsWhoTook = clientsWhoTook;
        this.clientsWhoReserved = clientsWhoReserved;
    }

    String getTitle() {
        return title;
    }

    void takeBook(Client client) {
        countOfBooks--;
        String[] newClientsWhoTookList = new String[clientsWhoTook.length+1];
        System.arraycopy(clientsWhoTook, 0, newClientsWhoTookList, 0, clientsWhoTook.length);
        newClientsWhoTookList[newClientsWhoTookList.length-1] = client.getClientName();
        clientsWhoTook = newClientsWhoTookList;
    }

    void returnBook(Client client) {
        countOfBooks++;
        String[] newClientsWhoTookList = new String[clientsWhoTook.length - 1];
        for (int i = 0, j = 0; i < clientsWhoTook.length - 1; i++) {
            if (!(clientsWhoTook[i].equals(client.getClientName()))) {
                newClientsWhoTookList[j++] = clientsWhoTook[i];
            }
        }
        clientsWhoTook = newClientsWhoTookList;
    }

    void reserveBook(Client client) {
        String[] newClientsWhoReserved = new String[clientsWhoReserved.length+1];
        System.arraycopy(clientsWhoReserved, 0, newClientsWhoReserved, 0, clientsWhoReserved.length);
        newClientsWhoReserved[newClientsWhoReserved.length-1] = client.getClientName();
        clientsWhoReserved = newClientsWhoReserved;
    }
}
