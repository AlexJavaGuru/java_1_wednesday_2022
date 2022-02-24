package teacher.lesson_6_arrays_while_loop.lessoncode.branching;

public class ContinueBreakExample {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("For J number: " + j);
            for (int k = 0; k < 10; k++) {
                if (k == 5) {
                    break;
                }
                System.out.print(" K are: " + k);
            }
            System.out.println();
        }
    }
}
