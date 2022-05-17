package student_arturs_melnikovs.lesson_06.level_04;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Infinite loop");
            i--;
            break;
        }
    }
}
