package student_aleksandr_zuk.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.pinCodeTest();
        test.depositTestOne();
        test.depositTestTwo();
        test.depositTestThree();
        test.withdrawTestOne();
        test.withdrawTestTwo();
        test.withdrawTestThree();

    }
    public void checkResult(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
    public void pinCodeTest() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.deposit(1111, 100.1);
        double expectedResult = 0;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Pin Code test");
    }
    public void depositTestOne() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.deposit(1234, 100.1);
        double expectedResult = 100.1;
        double actualResult = card.getBalance();
        checkResult(actualResult,expectedResult,"Deposit test one");
    }
    public void depositTestTwo() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setLoanDebt(50.1);
        card.deposit(1234, 100.1);
        double expectedResult = 50;
        double actualResult = card.getBalance();
        checkResult(actualResult, expectedResult, "Deposit test two");
    }
    public void depositTestThree() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setLoanDebt(500.1);
        card.deposit(1234, 200.1);
        double expectedResult = 300;
        double actualResult = card.getLoanDebt();
        checkResult(actualResult,expectedResult,"Deposit test three");
    }
    public void withdrawTestOne() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(50);
        card.withdraw(1234, 10);
        double expectedResult = 40;
        double actualResult = card.getBalance();
        checkResult(actualResult,expectedResult,"Withdraw test one");
    }
    public void withdrawTestTwo() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(50);
        card.setCreditLimit(500);
        card.setLoanDebt(0);
        card.withdraw(1234, 100);
        double expectedResult = 50;
        double actualResult = card.getLoanDebt();
        checkResult(actualResult,expectedResult,"Withdraw test two");
    }
    public void withdrawTestThree() {
        CreditCard card = new CreditCard(1111222233334444L, 1234);
        card.setBalance(0);
        card.setCreditLimit(500);
        card.setLoanDebt(300);
        card.withdraw(1234, 500);
        double expectedResult = 0;
        double actualResult = card.getBalance();
        checkResult(actualResult,expectedResult,"Withdraw test three");
    }

}
