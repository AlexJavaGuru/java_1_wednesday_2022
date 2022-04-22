package student_aleksandrs_korsaks.ak_lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println("WhileLoopContinue " + i);
            i++;
        }
    }
}

