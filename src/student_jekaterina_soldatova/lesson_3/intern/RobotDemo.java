/*
        Создайте класс робот (Robot).

        Научите вашего робота "говорить" привет.

        Создайте в классе Robot метод со следующей сигнатурой:

public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
        }
*/

package student_jekaterina_soldatova.lesson_3.intern;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("GLaDOS");
        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot("Wall-E");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("R2-D2");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
