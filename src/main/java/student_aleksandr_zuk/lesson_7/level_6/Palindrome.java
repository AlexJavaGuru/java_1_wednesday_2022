package student_aleksandr_zuk.lesson_7.level_6;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        char[] array = textToArray(text);
        char[] reverseArray = reverseArray(array);
        return Arrays.equals(array, reverseArray);
    }

    public char[] textToArray(String text) {
        String textToLowerCase = text.replaceAll(" ", "");
        textToLowerCase = textToLowerCase.toLowerCase(Locale.ROOT);
        return textToLowerCase.toCharArray();
    }

    public char[] reverseArray(char[] text) {
        char[] array = new char[text.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = text[array.length - 1 - i];
        }
        return array;
    }
}
