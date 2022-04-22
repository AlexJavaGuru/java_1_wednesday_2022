package student_aleksandrs_korsaks.ak_lesson_7.level_6;

import java.util.Arrays;

class Palindrome {

    boolean isPalindrome(String text) {
        String filteredText = text.replaceAll(" ", "").toLowerCase();
        char[] symbolsArrayOfStraightText;
        char[] symbolsArrayOfReverseText = new char[filteredText.length()];
        symbolsArrayOfStraightText = filteredText.toCharArray();
        for (int i = 0; i <= filteredText.length() - 1; i++) {
            symbolsArrayOfReverseText[filteredText.length() - i - 1] = symbolsArrayOfStraightText[i];
        }
        return Arrays.equals(symbolsArrayOfReverseText, symbolsArrayOfStraightText);
    }
}
