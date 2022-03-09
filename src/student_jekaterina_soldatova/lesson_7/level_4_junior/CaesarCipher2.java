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
        StringBuilder newString = new StringBuilder();
        int offset = pair.getOffset();

        for (int i = 0; i < oldString.length(); i++) {

            char letter = replaceLetter(oldString.charAt(i), offset);
            newString.append(letter);
        }
        return newString.toString();
    }

    static char replaceLetter(char letter, int offset) {
        if (Pattern.matches("[a-z]", Character.toString(letter))) {
            return replaceLetterLowercase(letter, offset);
        } else if ("[A-Z]".contains(Character.toString(letter)))  {
            return replaceLetterUppercase(letter, offset);
        }
        return letter;
    }

    static char replaceLetterLowercase(char letter, int offset) {
        if ((int)letter - offset < (int)'a') {
            letter = (char) ((int)'z' - (offset - (int)letter - (int)'a') + 1);
        } else {
            letter = (char) ((int)letter - offset);
        }
        return letter;
    }

    static char replaceLetterUppercase(char letter, int offset) {
        if ((int)letter - offset < (int)'A') {
            letter = (char) ((int)'Z' - (offset - (int)letter - (int)'A') + 1);
        } else {
            letter = (char) ((int)letter - offset);
        }
        return letter;
    }

    void printResult(String sentence) {
        System.out.println("Ciphered string is:");
        System.out.println(sentence);
    }
}
