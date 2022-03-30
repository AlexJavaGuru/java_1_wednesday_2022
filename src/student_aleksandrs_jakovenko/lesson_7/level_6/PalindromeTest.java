package student_aleksandrs_jakovenko.lesson_7.level_6;

import java.util.Arrays;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.textToArrayTest();
        test.arrayReverse();
        test.palindromeTest1();
        test.palindromeTest2();
        test.palindromeTest3();
    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(char[] actualResult, char[] expectedResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void textToArrayTest() {
        Palindrome palindrome = new Palindrome();
        char[] actualResult = palindrome.textToArray("One ONE oNe");
        char[] expectedResult = {'o', 'n', 'e', 'o', 'n', 'e', 'o', 'n', 'e'};
        checkResult(actualResult, expectedResult, "Text to Array test");
    }

    public void arrayReverse() {
        Palindrome palindrome = new Palindrome();
        char[] elements = {'l', 'e', 'v'};
        char[] expectedResult = {'v', 'e', 'l'};
        char[] actualResult = palindrome.arrayReverse(elements);
        checkResult(actualResult, expectedResult, "Reverse test");
    }

    public void palindromeTest1() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("level");
        checkResult(actualResult, expectedResult, "Level test");
    }

    public void palindromeTest2() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("RaceCar");
        checkResult(actualResult, expectedResult, "Race car test");
    }

    public void palindromeTest3() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("А роза упала на лапу Азора");
        checkResult(actualResult, expectedResult, "Rose test");
    }
}
