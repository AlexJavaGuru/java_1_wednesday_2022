package student_jekaterina_soldatova.lesson06.level_4_junior;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("continue is here");
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
