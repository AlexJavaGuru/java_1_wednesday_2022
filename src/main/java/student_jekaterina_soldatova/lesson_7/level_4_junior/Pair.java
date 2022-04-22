package student_jekaterina_soldatova.lesson_7.level_4_junior;

class Pair {
    String stringFromUser;
    int offsetFromUser;

    Pair(String sentence, int number) {
        stringFromUser = sentence;
        offsetFromUser = number;
    }

    String getString() {
        return stringFromUser;
    }

    int getOffset() {
        return offsetFromUser;
    }
}