package student_aleksandrs_jakovenko.lesson_12.level_3;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        //это исключение, которое выбрасывается каждый раз, когда обращаемся к методу
        // или полю объекта по ссылке, которая равна null.
        Integer n1 = null;
        System.out.println(n1.toString());
    }
}
