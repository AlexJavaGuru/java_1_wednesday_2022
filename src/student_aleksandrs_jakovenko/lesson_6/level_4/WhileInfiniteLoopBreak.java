package student_aleksandrs_jakovenko.lesson_6.level_4;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i--;
            break;
        }
    }
}
