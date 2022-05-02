package student_igors.lessons_4.level_7;

public class FizzBuzz {
    public String detect(int number) {
        if (isDividedBy3(number)) {
            return "Fizz";
        }
        if (isDividedBy5(number)) {
            return "Buzz";
        }
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";
        }
        return "" + number;
    }
    private boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }
}


//    public String detect(int number) {
// Реализуйте следующие требования:
// - если переданное число делится на три возвращайте "Fizz"
// - если переданное число делится на пять возвращайте "Buzz"
// - если переданное число делится на три и на пять возвращайте "FizzBuzz"
// - иначе возвращайте само число в виде строки (подсказка: return "" +  number)