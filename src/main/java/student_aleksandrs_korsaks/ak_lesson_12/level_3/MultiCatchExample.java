package student_aleksandrs_korsaks.ak_lesson_12.level_3;

public class MultiCatchExample {
    public static void main(String[] args) throws Exception {
        try {
            int result = 1 / 0;
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
}

//Exception - это родительский класс для всех исключений этого рода (в том числи и для ArithmeticException)
//поэтому, ловя его вначале, ловить после ArithmeticException не имеет смысла (так как уже пойман и он, в том числе)
