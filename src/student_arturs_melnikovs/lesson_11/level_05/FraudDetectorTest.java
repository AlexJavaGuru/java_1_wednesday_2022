package student_arturs_melnikovs.lesson_11.level_05;

import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest tester = new FraudDetectorTest();
        tester.testRule1v1();
        tester.testRule1v2();
        tester.testRule2v1();
        tester.testRule2v2();
        tester.testRule3v1();
        tester.testRule3v2();
        tester.testRule4v1();
        tester.testRule4v2();
        tester.testRule5v1();

    }

    private void testRule5v1() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Germany");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(actual);
    }

    private void testRule4v2() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testRule4v1() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Jamaica");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(actual);
    }

    private void testRule3v2() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testRule3v1() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Sydney", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(actual);
    }

    private void testRule2v2() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testRule2v1() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,10000000);
        boolean actual = detector.isFraud(transaction);
        checkResult(actual);
    }

    private void testRule1v2() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Test", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000);
        boolean actual = detector.isFraud(transaction);
        checkResult(!actual);
    }

    private void testRule1v1() {
        FraudRulesList fraudRulesList = new FraudRulesList();
        List<FraudRule> rules = fraudRulesList.getFraudRules();
        FraudDetector detector = new FraudDetector(rules);
        Trader trader = new Trader("Pokemon", "Test", "Test");
        Transaction transaction = new Transaction(trader,1000);
        boolean actual = detector.isFraud(transaction);
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
