package studen_natalja_isajeva.lesson_6.level_4;

public class WhileInfiniteLoopBreak {
    // Task 19
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
            if (i == 3) {
                break;
            }
        }
    }
}
