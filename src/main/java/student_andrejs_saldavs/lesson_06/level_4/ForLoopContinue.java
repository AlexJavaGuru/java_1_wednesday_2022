package student_andrejs_saldavs.lesson_06.level_4;

class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("For i number: " + i);
            for (int j = 1; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.print(" j is: " + j);
            }
            System.out.println();
        }
    }
}
