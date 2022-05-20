package student_arturs_melnikovs.lesson_12.level_03;

import teacher.lesson_9_interfaces.lessoncode.bookssystem.Book;


class NullPointerExceptionDemo {

    public static void main(String[] args) {
        Book book = null;
        book.isNotTaken();
    }

}

//Исключение можно получить, вызывая методы или поля у нулёвых объектов,
//передавая нулёвые параметры в методы