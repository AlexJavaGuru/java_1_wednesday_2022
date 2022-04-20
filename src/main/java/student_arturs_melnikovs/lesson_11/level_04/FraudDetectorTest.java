package student_arturs_melnikovs.lesson_11.level_04;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest tester = new FraudDetectorTest();
        tester.testIsTraderFraud1();
        tester.testIsTraderFraud2();
        tester.testIsAmountFraud1();
        tester.testIsAmountFraud2();
        tester.testIsCityFraud1();
        tester.testIsCountryFraud1();
        tester.testIsCountryFraud2();
        tester.testIsAmountCountryFraud1();
        tester.testIsAmountCountryFraud2();
    }

    private void testIsAmountCountryFraud2() {
        Trader trader = new Trader("Test", "Test", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testIsAmountCountryFraud1() {
        Trader trader = new Trader("Test", "Test", "Germany");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(actual);
    }

    private void testIsCountryFraud2() {
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testIsCountryFraud1() {
        Trader trader = new Trader("Test", "Test", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(actual);
    }

    private void testIsCityFraud1() {
        Trader trader = new Trader("Test", "Sydney");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(actual);
    }


    private void testIsAmountFraud1() {
        Trader trader = new Trader("Test", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(actual);
    }
    private void testIsAmountFraud2() {
        Trader trader = new Trader("Test", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testIsTraderFraud1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(actual);
    }
    private void testIsTraderFraud2() {
        Trader trader = new Trader("Test", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean actual = fraudDetector.isFraud(transaction);
        checkResult(!actual);
    }

    private void checkResult(boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has FAILED");
        }
    }
}
