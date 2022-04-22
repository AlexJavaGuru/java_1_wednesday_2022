package student_jekaterina_soldatova.lesson06.level_7_senior;

class FizzBuzz {
    
    String detect(int number) {
        String result = "";
        if (number % 3 != 0 && number % 5 != 0) {
            result += number;
        } else {
            if (number % 3 == 0) {
                result += "Fizz";
            }
            if (number % 5 == 0) {
                result += "Buzz";
            }
        }
        return result;
    }
}
