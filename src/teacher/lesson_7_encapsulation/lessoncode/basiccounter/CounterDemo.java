package teacher.lesson_7_encapsulation.lessoncode.basiccounter;

public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.setCounter(-100);

        System.out.println(counter.getCount());

        counter.count = -100;
        System.out.println(counter.getCount());
    }
}
