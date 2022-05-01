package student_arturs_melnikovs.lesson_11.level_05;

class FraudRuleTest {
    public static void main(String[] args) {
        FraudRuleTest tester = new FraudRuleTest();
        tester.testFraudRule1V1();
        tester.testFraudRule1V2();
        tester.testFraudRule2V1();
        tester.testFraudRule2V2();
        tester.testFraudRule3V1();
        tester.testFraudRule3V2();
        tester.testFraudRule4V1();
        tester.testFraudRule4V2();
        tester.testFraudRule5V1();
        tester.testFraudRule5V2();
    }

    private void testFraudRule5V2() {
        Trader trader = new Trader("Test", "Test", "Germany");
        Transaction transaction = new Transaction(trader,1000);
        FraudRule fraudRule = new FraudRule5("Country&Amount");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(!actual);
    }

    private void testFraudRule5V1() {
        Trader trader = new Trader("Test", "Test", "Germany");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule5("Country&Amount");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(actual);
    }

    private void testFraudRule4V2() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule4("Country");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(!actual);
    }

    private void testFraudRule4V1() {
        Trader trader = new Trader("Test", "Test", "Jamaica");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule4("Country");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(actual);
    }

    private void testFraudRule3V2() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule3("City");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(!actual);
    }

    private void testFraudRule3V1() {
        Trader trader = new Trader("Test", "Sydney", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule3("City");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(actual);
    }

    private void testFraudRule2V2() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        FraudRule fraudRule = new FraudRule2("Amount");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(!actual);
    }

    private void testFraudRule2V1() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,10000000);
        FraudRule fraudRule = new FraudRule2("Amount");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(actual);
    }

    private void testFraudRule1V2() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000);
        FraudRule fraudRule = new FraudRule1("Pokemon");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(!actual);
    }

    private void testFraudRule1V1() {
        Trader trader = new Trader("Pokemon", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000);
        FraudRule fraudRule = new FraudRule1("Pokemon");
        boolean actual = fraudRule.isFraud(transaction);
        checkResult(actual);
    }

    private void checkResult(boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has FAILED");
        }
    }
}
