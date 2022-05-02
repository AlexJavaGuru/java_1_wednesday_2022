package student_arturs_melnikovs.lesson_08.level_07;

class LibraryRepository {
    int numberOfBooks;
    Book[] listOfBooks;


    public void takeBook(Book bookToTake, String nameOfTaker, String dateOfReturn) {
       //Находит книгу в массиве и если она доступна, меняет статус на недоступную
       //и записывает имя взявшего книгу и дату возвращения
    }
    public void returnBook(Book bookToReturn) {
       //Меняет статус книги в массиве на доступную и убирает из состояния книги имя взявшего
    }
    public Book findBook(String nameOfTheBook, String author) {
       //Ищет и возвращает книгу по названию и автору
        return null;
    }
    public void reserveBook(Book bookToReserve, String nameOfPerson) {
        //Меняет статус книги в массиве на зарезервированую конкретным человеком
    }
    public void sendRemainder(Book[] listOfBooks) {
        //Проверяет все взятые книги и отправляет письмо с датой до которой надо сдать книгу
    }
    public void addBook(Book bookToAdd) {
        //Добавляет новую инстанцию книги в массив
    }
}
