package student_arturs_melnikovs.lesson_07.level_06;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest tester = new CreditCardTest();
        tester.testDepositWrongPIN();
        tester.testDepositNoDebt();
        tester.testDepositSmallDebt();
        tester.testDepositBigDebt();
        tester.testWithdrawWrongPIN();
        tester.testWithdrawNoDebt();
        tester.testWithdrawLessThanLimit();
        tester.testWithdrawMoreThanLimit();
    }

    public void testWithdrawWrongPIN() {
        CreditCard card = new CreditCard(123465, 1000);
        int expectedResult = 0;
        card.withdraw(1001, 100);
        int actualResult = card.getBalance();
        checkResult(expectedResult, actualResult, "Withdraw with wrong PIN test");
    }
    public void testWithdrawNoDebt() {
        CreditCard card = new CreditCard(123465, 1000);
        int expectedResult = 60;
        card.deposit(1000, 100);
        card.withdraw(1000, 40);
        int actualResult = card.getBalance();
        checkResult(expectedResult, actualResult, "Withdraw with no debt test");
    }
    public void testWithdrawLessThanLimit() {
        CreditCard card = new CreditCard(123465, 1000);
        card.setCreditLimit(100);
        int expectedBalance = 0;
        int expectedDebt = 50;
        card.deposit(1000, 100);
        card.withdraw(1000, 150);
        int actualBalance = card.getBalance();
        int actualDebt = card.getCreditDebt();
        checkResult(expectedBalance, actualBalance, expectedDebt, actualDebt, "Withdraw less than limit test");
    }
    public void testWithdrawMoreThanLimit() {
        CreditCard card = new CreditCard(123465, 1000);
        card.setCreditLimit(100);
        int expectedBalance = 100;
        int expectedDebt = 0;
        card.deposit(1000, 100);
        card.withdraw(1000, 250);
        int actualBalance = card.getBalance();
        int actualDebt = card.getCreditDebt();
        checkResult(expectedBalance, actualBalance, expectedDebt, actualDebt, "Withdraw more than limit test");
    }

    public void testDepositWrongPIN() {
        CreditCard card = new CreditCard(123465, 1000);
        int expectedResult = 0;
        card.deposit(1001, 100);
        int actualResult = card.getBalance();
        checkResult(expectedResult, actualResult, "Deposit with wrong PIN test");
    }
    public void testDepositNoDebt() {
        CreditCard card = new CreditCard(123465, 1000);
        int expectedResult = 100;
        card.deposit(1000, 100);
        int actualResult = card.getBalance();
        checkResult(expectedResult, actualResult, "Deposit with no debt test");
    }
    public void testDepositSmallDebt() {
        CreditCard card = new CreditCard(123465, 1000);
        card.setCreditLimit(100);
        card.withdraw(1000, 10);
        int expectedResult = 90;
        card.deposit(1000, 100);
        int actualResult = card.getBalance();
        checkResult(expectedResult, actualResult, "Deposit with small debt test");
    }
    public void testDepositBigDebt() {
        CreditCard card = new CreditCard(123465, 1000);
        card.setCreditLimit(100);
        card.withdraw(1000, 100);
        int expectedBalance = 0;
        int expectedDebt = 90;
        card.deposit(1000, 10);
        int actualBalance = card.getBalance();
        int actualDebt = card.getCreditDebt();
        checkResult(expectedBalance, actualBalance, expectedDebt, actualDebt, "Deposit with big debt test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

    void checkResult(int expectedBalance, int actualBalance, int expectedDebt, int actualDebt, String testName) {
        if (expectedBalance == actualBalance && expectedDebt == actualDebt) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
