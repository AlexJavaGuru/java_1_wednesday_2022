package student_andrejs_saldavs.lesson_07.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.withdrawWrongPinTest();
        creditCardTest.depositWrongPinTest();
        creditCardTest.withdrawTest();
        creditCardTest.debtTest();
    }

    public void withdrawWrongPinTest() {
        CreditCard creditCard = new CreditCard(112233, 1234);
        int expectedResult = 0;
        creditCard.withdraw(9876, 100);
        int actualResult = creditCard.getBalance();
        checkResult(expectedResult, actualResult, "Withdraw wrong pin test");
    }

    public void depositWrongPinTest() {
        CreditCard creditCard = new CreditCard(112233, 1234);
        int expectedResult = 0;
        creditCard.deposit(9876, 100);
        int actualResult = creditCard.getBalance();
        checkResult(expectedResult, actualResult, "Deposit wrong pin test");
    }

    public void withdrawTest() {
        CreditCard creditCard = new CreditCard(112233, 1234);
        int expectedResult = 20;
        creditCard.deposit(1234, 50);
        creditCard.withdraw(1234, 30);
        int actualResult = creditCard.getBalance();
        checkResult(expectedResult, actualResult, "Withdraw test");
    }

    public void debtTest() {
        CreditCard creditCard = new CreditCard(112233, 1234);
        int expectedBalance = 0;
        int expectedDebt = 30;
        creditCard.deposit(1234, 100);
        creditCard.withdraw(1234, 130);
        int actualBalance = creditCard.getBalance();
        int actualDebt = creditCard.getDebt();
        checkResult(expectedBalance, actualBalance, expectedDebt, actualDebt, "Debt test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult );
        }
    }

    void checkResult(int expectedBalance, int actualBalance, int expectedDebt, int actualDebt, String testName) {
        if (expectedBalance == actualBalance && expectedDebt == actualDebt) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedBalance + " but actual is " + actualBalance + ". Expected debt was " + expectedDebt + " but actual is " + actualDebt);
        }
    }


}
