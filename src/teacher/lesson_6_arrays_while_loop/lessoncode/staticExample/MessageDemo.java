package teacher.lesson_6_arrays_while_loop.lessoncode.staticExample;

import java.util.Arrays;

public class MessageDemo {

    public static void main(String[] args) {
        System.out.println(Message.count);
        Message hello = new Message("Hello");
        Message itsMe = new Message("It's me");
        Message mario = new Message("Mario!");
        System.out.println(Message.count);
        System.out.println(Message.getCount());
        MessageDemo myObject = new MessageDemo();
        myObject.doSomething();
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
