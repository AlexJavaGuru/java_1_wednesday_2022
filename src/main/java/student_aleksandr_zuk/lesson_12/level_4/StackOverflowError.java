package student_aleksandr_zuk.lesson_12.level_4;

class StackOverflowError {

    public static void main(String[] args) {

        StackOverflowError test = new StackOverflowError();
        test.y(1);
    }

    public void y(int x) {
        y(x + 1);
    }
}
