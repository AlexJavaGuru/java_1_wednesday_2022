package student_arturs_melnikovs.lesson_06.level_04;

class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
