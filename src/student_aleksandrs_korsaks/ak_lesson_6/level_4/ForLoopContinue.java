package student_aleksandrs_korsaks.ak_lesson_6.level_4;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("ForLoopContinue " + i);
        }
    }
}
