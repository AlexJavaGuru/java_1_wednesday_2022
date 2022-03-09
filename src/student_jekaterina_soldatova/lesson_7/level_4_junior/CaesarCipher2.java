package student_jekaterina_soldatova.lesson_7.level_4_junior;

import java.util.Scanner;
import java.util.regex.Pattern;


class CaesarCipher2 {
    //get string
    //replace letters
    //print

    Pair getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to cipher and an offset (number)");
        String stringFromUser = scanner.nextLine();
        int offsetFromUser = scanner.nextInt();
        return new Pair(stringFromUser, offsetFromUser);
    }

    String goThroughSentence(Pair pair) {
        String oldString = pair.getString();
        int offset = pair.getOffset();
        String newString = "";

        for (int i = 0; i < oldString.length(); i++) {
            newString += replaceLetter(oldString.charAt(i), offset);
        }
        return newString;
    }

    static char replaceLetter(char letter, int offset) {
        if (Pattern.matches("[a-z]", Character.toString(letter))) {
            return replaceLetterLowercase(letter, offset);
        } else if (Pattern.matches("[A-Z]", Character.toString(letter)))  {
            return replaceLetterUppercase(letter, offset);
        }
        return letter;
    }

    static char replaceLetterLowercase(char letter, int offset) {
        if (letter - offset < 'a') {
            letter = (char) ('z' - (offset - (letter - 'a')) + 1);
        } else {
            letter = (char) (letter - offset);
        }
        return letter;
    }

    static char replaceLetterUppercase(char letter, int offset) {
        if (letter - offset < 'A') {
            letter = (char) ('Z' - (offset - (letter - 'A')) + 1);
        } else {
            letter = (char) (letter - offset);
        }
        return letter;
    }

    void printResult(String sentence) {
        System.out.println("Ciphered string is:");
        System.out.println(sentence);
    }
}
