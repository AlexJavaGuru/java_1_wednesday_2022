/*
        Создайте класс робот (Robot).

        Научите вашего робота "говорить" привет.

        Создайте в классе Robot метод со следующей сигнатурой:

public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
        }
*/

package student_jekaterina_soldatova.lesson_3.intern;

public class Robot {
    String name;
    public Robot() {
    }

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
