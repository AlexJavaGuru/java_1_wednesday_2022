package student_aleksandrs_jakovenko.lesson_12.level_3;

class MultiCatchExample {

    public static void main(String[] args) {

        //ArithmeticException включён в Exception, поэтому он уже будет проверен
        // до того как дойдёт до catch (ArithmeticException a)
        try {

        } catch (Exception a) {

        }
    }
}
