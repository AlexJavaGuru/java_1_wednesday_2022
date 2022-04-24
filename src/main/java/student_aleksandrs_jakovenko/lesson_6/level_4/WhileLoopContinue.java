package student_aleksandrs_jakovenko.lesson_6.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 7) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
