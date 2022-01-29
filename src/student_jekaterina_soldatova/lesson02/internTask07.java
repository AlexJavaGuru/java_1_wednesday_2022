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
        LoginService testing = new LoginService();

        System.out.println("Your new login:");
        String login = scanner.nextLine();
       // testing();

        System.out.println("Your new password:");
        String password = scanner.nextLine();


    }
}
