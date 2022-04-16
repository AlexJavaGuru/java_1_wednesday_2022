package student_aleksandrs_korsaks.ak_lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.withdrawFromCardWrongPinTest();
        creditCardTest.withdrawFromCardPinOkTest();
        creditCardTest.depositToCardPinOk();
        creditCardTest.depositToCardWrongPinTest();
        creditCardTest.withdrawFromCardOverLimitTest();
        creditCardTest.withdrawFromCardWithinLimitTest();
        creditCardTest.depositToCardAmountLessThanOverdraftTest();
        creditCardTest.depositToCardAmountMoreThanOverdraftTest();
        creditCardTest.withdrawFromCardAmountLessThanBalanceTest();
        creditCardTest.withdrawFromCardAmountMoreThanBalanceTest();

    }

    public void withdrawFromCardWrongPinTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResult = 0;
        firstCreditCard.withdrawFromCard(15,122);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardWrongPinTest", expectedResult == realResultForBalance && expectedResult == realResultForOverdraft);
    }

    public void withdrawFromCardPinOkTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResultForBalance = 0;
        int expectedResultForOverdraft = -15;
        firstCreditCard.withdrawFromCard(15,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardPinOk", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void depositToCardPinOk() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResultForBalance = 15;
        int expectedResultForOverdraft = 0;
        firstCreditCard.depositToCard(15,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("depositToCardPinOk", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void depositToCardWrongPinTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResult = 0;
        firstCreditCard.depositToCard(15,122);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("depositToCardWrongPinTest", expectedResult == realResultForBalance && expectedResult == realResultForOverdraft);
    }

    public void withdrawFromCardOverLimitTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResult = 0;
        firstCreditCard.withdrawFromCard(31,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardOverLimitTest", expectedResult == realResultForBalance && expectedResult == realResultForOverdraft);
    }

    public void withdrawFromCardWithinLimitTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        int expectedResultForBalance = 0;
        int expectedResultForOverdraft = -30;
        firstCreditCard.withdrawFromCard(30,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardWithinLimitTest", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void depositToCardAmountLessThanOverdraftTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        firstCreditCard.withdrawFromCard(30,123);
        int expectedResultForBalance = 0;
        int expectedResultForOverdraft = -15;
        firstCreditCard.depositToCard(15,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("depositToCardAmountLessThanOverdraftTest", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void depositToCardAmountMoreThanOverdraftTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        firstCreditCard.withdrawFromCard(30,123);
        int expectedResultForBalance = 15;
        int expectedResultForOverdraft = 0;
        firstCreditCard.depositToCard(45,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("depositToCardAmountMoreThanOverdraftTest", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void withdrawFromCardAmountLessThanBalanceTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        firstCreditCard.depositToCard(15,123);
        int expectedResultForBalance = 5;
        int expectedResultForOverdraft = 0;
        firstCreditCard.withdrawFromCard(10,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardAmountLessThanBalanceTest", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void withdrawFromCardAmountMoreThanBalanceTest() {
        CreditCard firstCreditCard = new CreditCard(11111, 123, 30);
        firstCreditCard.depositToCard(5,123);
        int expectedResultForBalance = 0;
        int expectedResultForOverdraft = -5;
        firstCreditCard.withdrawFromCard(10,123);
        int realResultForBalance = firstCreditCard.getCardBalance();
        int realResultForOverdraft = firstCreditCard.getCardOverdraft();
        checkTestResult("withdrawFromCardAmountLessThanBalanceTest", expectedResultForBalance == realResultForBalance && expectedResultForOverdraft == realResultForOverdraft);
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }

}
