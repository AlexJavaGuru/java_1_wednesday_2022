/*
        Дан код, нужно сделать этот код запускаемым.
        Для сдачи работы создайте исправленный класс.

class LoginService {

    public void main(String[] args) {
        System.out.println("You can login!");
    }
}
 */

package student_jekaterina_soldatova.lesson02.level_2_intern;


import java.util.Scanner;

public class InternTask07 {
    public static void main(String[] args) {
        int loginLength = 4;
        int passwordLength = 6;
        Scanner scanner = new Scanner(System.in);
        LoginService test = new LoginService();

        System.out.println("Your new login:");
        String login = scanner.nextLine();
        while (test.CheckLength(login, loginLength)){
            System.out.println("Should be at least " + loginLength + " characters long, please choose another");
            login = scanner.nextLine();
        }

        System.out.println("Your new password:");
        String password = scanner.nextLine();
        while (test.CheckLength(password, passwordLength) || test.CheckChars(password)){
            if (test.CheckLength(password, passwordLength)) {
                System.out.println("Should be at least " + passwordLength + " characters long, please choose another");
                password = scanner.nextLine();
            }
            if (test.CheckChars(password)){
                System.out.println("Should contain at least one capital letter or a number or a special character, please choose another");
                password = scanner.nextLine();
            }
        }
        System.out.println("You can login!");
    }
}
