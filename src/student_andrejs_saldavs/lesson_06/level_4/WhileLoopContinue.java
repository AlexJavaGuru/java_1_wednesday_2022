package student_andrejs_saldavs.lesson_06.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while (i < 20) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
