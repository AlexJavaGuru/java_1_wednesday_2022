package student_aleksandr_zuk.lesson_7.level_6;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.textToArrayTest();
        test.reverseArrayTest();
        test.palindromeTestOne();
        test.palindromeTestTwo();
        test.palindromeTestThree();

    }
    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
    public void checkResult(char[] actualResult, char[] expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
    public void textToArrayTest() {
        Palindrome palindrome = new Palindrome();
        char[] actualResult = palindrome.textToArray("One ONE onE");
        char[] expectedResult = {'o','n','e','o','n','e','o','n','e'};
        checkResult(actualResult,expectedResult,"Text to array test");
    }
    public void reverseArrayTest() {
        Palindrome palindrome = new Palindrome();
        char[] letters = {'d','o','g'};
        char[] expectedResult = {'g','o','d'};
        char[] actualResult = palindrome.reverseArray(letters);
    }
    public void palindromeTestOne() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("level");
        checkResult(actualResult,expectedResult,"Palindrome test Level");
    }
    public void palindromeTestTwo() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("RaceCar");
        checkResult(actualResult, expectedResult, "Palindrome test Race car");
    }
    public void palindromeTestThree() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("А роза упала на лапу Азора");
        checkResult(actualResult, expectedResult, "Palindrome test Rose");
    }

}
