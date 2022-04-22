package student_aleksandrs_jakovenko.lesson_8.level_6;

class Varargs {

    public void example(int... arguments) {
        System.out.println("Number of arguments: " + arguments.length);
        for (int i : arguments) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.example(1, 2, 3, 4, 5, 6, 7);
        varargs.example(10);
    }
}
