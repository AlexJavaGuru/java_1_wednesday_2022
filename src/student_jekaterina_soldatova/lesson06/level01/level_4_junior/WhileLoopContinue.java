package student_jekaterina_soldatova.lesson06.level01.level_4_junior;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                i++;
                System.out.println("continue is here");
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
