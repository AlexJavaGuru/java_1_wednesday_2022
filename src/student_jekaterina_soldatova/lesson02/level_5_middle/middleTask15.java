/*
Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text");
 */

package student_jekaterina_soldatova.lesson02.level_5_middle;

public class middleTask15 {
    public static void main(String[] args) {
        for (int i = 65; i < 91; i++){
            System.out.print((char) i + " ");
        }
    }
}

