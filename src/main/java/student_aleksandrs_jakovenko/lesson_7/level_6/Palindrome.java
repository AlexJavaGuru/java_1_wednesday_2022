package student_aleksandrs_jakovenko.lesson_7.level_6;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        char[] array = textToArray(text);
        char[] reversedArray = arrayReverse(array);
        return Arrays.equals(array, reversedArray);
    }

    public char[] textToArray(String text) {
        String textToLowerCase = text.replaceAll(" ", "");
        textToLowerCase = textToLowerCase.toLowerCase(Locale.ROOT);
        return textToLowerCase.toCharArray();
    }

    public char[] arrayReverse(char[] text) {
        char[] array = new char[text.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = text[array.length - 1 - i];
        }
        return array;
    }
}
