package student_jekaterina_soldatova.lesson06.level_4_junior;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i > 0) {
            System.out.println("i = " + i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }
}
