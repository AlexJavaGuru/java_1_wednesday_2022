/*
        Дан код, нужно сделать этот код запускаемым.
        Для сдачи работы создайте исправленный класс.

class LoginService {

    public void main(String[] args) {
        System.out.println("You can login!");
    }
}
 */

package student_jekaterina_soldatova.lesson02;

import java.util.Scanner;

public class internTask07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginService test = new LoginService();

        System.out.println("Your new login:");
        String login = scanner.nextLine();
        while (test.Check(login, 4)){
            System.out.println("Should be at least 4 characters long, please choose another");
            login = scanner.nextLine();
        }

        System.out.println("Your new password:");
        String password = scanner.nextLine();
        while (test.Check(password, 6)){
            System.out.println("Should be at least 6 characters long, please choose another");
            password = scanner.nextLine();
        }


    }
}
