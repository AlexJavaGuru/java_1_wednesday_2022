package studen_natalja_isajeva.lesson_6.level_4;

public class ForLoopContinue {
    // Task 20
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
