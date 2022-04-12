package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

import java.util.ArrayList;
import java.util.List;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.pokemonTest1();
        test.pokemonTest2();
        test.amountTest1();
        test.amountTest2();
        test.cityTest1();
        test.cityTest2();
        test.countryTest1();
        test.countryTest2();
        test.germanyTest1();
        test.germanyTest2();
    }

    void pokemonTest1() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule1 rule1 = new FraudRule1("Rule1");
        rules.add(rule1);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = true;
        checkResult(expectedResult, actualResult, "Pokemon test1");
    }

    void pokemonTest2() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule1 rule1 = new FraudRule1("Rule1");
        rules.add(rule1);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = false;
        checkResult(expectedResult, actualResult, "Pokemon test2");
    }

    void amountTest1() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule2 rule2 = new FraudRule2("Rule2");
        rules.add(rule2);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex");
        Transaction t = new Transaction(trader, 10000001);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = true;
        checkResult(expectedResult, actualResult, "Amount test1");
    }

    void amountTest2() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule2 rule2 = new FraudRule2("Rule2");
        rules.add(rule2);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex");
        Transaction t = new Transaction(trader, 50);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = false;
        checkResult(expectedResult, actualResult, "Amount test2");
    }

    void cityTest1() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule3 rule3 = new FraudRule3("Rule3");
        rules.add(rule3);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Sydney");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = true;
        checkResult(expectedResult, actualResult, "City test1");
    }

    void cityTest2() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule3 rule3 = new FraudRule3("Rule3");
        rules.add(rule3);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Test", "Riga");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = false;
        checkResult(expectedResult, actualResult, "City test2");
    }

    void countryTest1() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule4 rule4 = new FraudRule4("Rule4");
        rules.add(rule4);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Test", "Jamaika");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = true;
        checkResult(expectedResult, actualResult, "Country test1");
    }

    void countryTest2() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule4 rule4 = new FraudRule4("Rule4");
        rules.add(rule4);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = false;
        checkResult(expectedResult, actualResult, "Country test2");
    }

    void germanyTest1() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule5 rule5 = new FraudRule5("Rule5");
        rules.add(rule5);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 5000);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = true;
        checkResult(expectedResult, actualResult, "Germany and >1000 test1");
    }

    void germanyTest2() {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule5 rule5 = new FraudRule5("Rule5");
        rules.add(rule5);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 100);
        boolean actualResult = fraudDetector.isFraud(t, rules).isFraud();
        boolean expectedResult = false;
        checkResult(expectedResult, actualResult, "Germany and >1000 test2");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
