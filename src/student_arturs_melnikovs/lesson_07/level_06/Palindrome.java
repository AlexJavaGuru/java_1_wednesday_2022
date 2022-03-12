package student_arturs_melnikovs.lesson_07.level_06;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        char[] chars = createCharArray(text);
        char[] reversedArray = reverseArray(chars);
        return Arrays.equals(chars, reversedArray);
    }

    char[] createCharArray(String text) {
        String noSpaces = text.replaceAll(" ", "");
        noSpaces = noSpaces.toLowerCase(Locale.ROOT);
        return noSpaces.toCharArray();
    }

    char[] reverseArray(char[] chars) {
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return reversed;
    }

}
