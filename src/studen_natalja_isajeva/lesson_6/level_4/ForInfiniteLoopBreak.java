package studen_natalja_isajeva.lesson_6.level_4;

public class ForInfiniteLoopBreak {
    //Task 19
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

}
