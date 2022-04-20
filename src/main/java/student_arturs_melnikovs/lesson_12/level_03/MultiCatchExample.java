package student_arturs_melnikovs.lesson_12.level_03;

class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int num = 5 / 0;
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Any exception");
        }

    }
}
//Код не компилиолвался, потому что сначала нужно ловить арифметисечкое исключение,
//а уже потом общее. (Хотя вроде бы общий Exception в целом ловить не очень правильно)