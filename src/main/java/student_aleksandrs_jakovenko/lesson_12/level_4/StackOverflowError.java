package student_aleksandrs_jakovenko.lesson_12.level_4;


class StackOverflowError {

    public static void main(String[] args) {
        
        StackOverflowError test = new StackOverflowError();
        test.f(1);
    }

    public void f(int x) {
        f(x + 1);
    }
}