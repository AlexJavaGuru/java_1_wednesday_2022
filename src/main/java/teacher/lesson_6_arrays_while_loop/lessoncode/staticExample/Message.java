package teacher.lesson_6_arrays_while_loop.lessoncode.staticExample;

public class Message {

    public static int count = 0;
    String text;

    public Message(String text) {
        count++;
        this.text = text;
    }

    public static int getCount() {
        return count;
    }
}
