package student_aleksandr_zuk.lesson_6.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            if (i == 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
