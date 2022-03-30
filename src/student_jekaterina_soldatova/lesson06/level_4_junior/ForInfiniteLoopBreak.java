package student_jekaterina_soldatova.lesson06.level_4_junior;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i > 0; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
