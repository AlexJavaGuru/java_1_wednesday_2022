package teacher.lesson_2.lessoncode;

import org.w3c.dom.ls.LSOutput;

public class CharExample {
    public static void main(String[] args) {
        char symbol = 'A';
        short code = (short) symbol;
        System.out.println("Code = " + code);

        code = 65;
        symbol = (char) code;
        System.out.println("Symbol = " + symbol);
    }
}
