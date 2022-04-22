package student_aleksandrs_korsaks.ak_lesson_7.level_6;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTest1();
        palindromeTest.isPalindromeTest2();
        palindromeTest.isPalindromeTest3();
        palindromeTest.isPalindromeTest4();
        palindromeTest.isNotPalindromeTest5();

    }

    public void isPalindromeTest1() {
        boolean result = palindrome.isPalindrome("racecar");
        checkTestResult("palindromeTest1", result);
    }

    public void isPalindromeTest2() {
        boolean result = palindrome.isPalindrome("level");
        checkTestResult("isPalindromeTest2", result);
    }

    public void isPalindromeTest3() {
        boolean result = palindrome.isPalindrome("sum summus mus");
        checkTestResult("isPalindromeTest3", result);
    }

    public void isPalindromeTest4() {
        boolean result = palindrome.isPalindrome("А роза упала на лапу Азора");
        checkTestResult("isPalindromeTest4", result);
    }

    public void isNotPalindromeTest5() {
        boolean result = palindrome.isPalindrome("А роза упала на лапу Азорааф");
        checkTestResult("isNotPalindromeTest5", !result);
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
