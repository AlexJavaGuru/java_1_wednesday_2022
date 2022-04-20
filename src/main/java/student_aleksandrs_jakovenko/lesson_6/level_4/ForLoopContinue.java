package student_aleksandrs_jakovenko.lesson_6.level_4;

class ForLoopContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
