package student_aleksandrs_jakovenko.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.pinCodeTest();
        test.depositTest1();
        test.depositTest2();
        test.depositTest3();
        test.withdrawTest1();
        test.withdrawTest2();
        test.withdrawTest3();
    }

    public void checkResult(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void pinCodeTest() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.deposit(1111, 100.5);
        double expectedResult = 0;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "PinCode test");
    }

    public void depositTest1() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.deposit(1234, 100.5);
        double expectedResult = 100.5;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Deposit test1");
    }

    public void depositTest2() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setLoanDebt(20.5);
        card.deposit(1234, 100.5);
        double expectedResult = 80;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Deposit test2");
    }

    public void depositTest3() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setLoanDebt(200.5);
        card.deposit(1234, 100.5);
        double expectedResult = 100;
        double actualResult = card.getLoanDebt();
        checkResult(actualResult, expectedResult, "Deposit test3");
    }

    public void withdrawTest1() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(100);
        card.withdraw(1234, 20);
        double expectedResult = 80;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Withdraw test1");
    }

    public void withdrawTest2() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(50);
        card.setCreditLimit(1000);
        card.setLoanDebt(0);
        card.withdraw(1234, 200);
        double expectedResult = 150;
        double actualResult = card.getLoanDebt();
        checkResult(actualResult, expectedResult, "Withdraw test2");
    }

    public void withdrawTest3() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setCreditLimit(200);
        card.setLoanDebt(150);
        card.withdraw(1234, 1000);
        double expectedResult = 0;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Withdraw test3");
    }
}
