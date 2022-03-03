package student_arturs_melnikovs.lesson_07.level_06;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest tester = new PalindromeTest();
        tester.testIsPalindromeV1();
        tester.testIsPalindromeV2();
        tester.testIsPalindromeV3();
        tester.testIsPalindromeNegative();
    }

    public void testIsPalindromeV1() {
        Palindrome palindrome = new Palindrome();
        String test = "А роза упала на лапу Азора";
        boolean actualResult = palindrome.isPalindrome(test);
        checkResult(actualResult, "Palindrome positive test 1");
    }
    public void testIsPalindromeV2() {
        Palindrome palindrome = new Palindrome();
        String test = "Racecar";
        boolean actualResult = palindrome.isPalindrome(test);
        checkResult(actualResult, "Palindrome positive test 2");
    }
    public void testIsPalindromeV3() {
        Palindrome palindrome = new Palindrome();
        String test = "sum summus mus";
        boolean actualResult = palindrome.isPalindrome(test);
        checkResult(actualResult, "Palindrome positive test 3");
    }
    public void testIsPalindromeNegative() {
        Palindrome palindrome = new Palindrome();
        String test = "А роза упала на лапу Шарика";
        boolean actualResult = palindrome.isPalindrome(test);
        checkResult(!actualResult, "Palindrome negative test");
    }

    void checkResult(boolean actualResult, String testName) {
        if(actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
