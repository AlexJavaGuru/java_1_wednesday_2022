package student_igors.lesson_6.level_7;

public class FizzBuzz {
    public String detect(int number) {
        if ((number % 7 == 0) && (number % 9 == 0)) return "FizzBuzz";
        else if (number % 7 == 0) return "Fizz";
        else if (number % 9 == 0) return "Buzz";
        else return "" + number;
    }

}

