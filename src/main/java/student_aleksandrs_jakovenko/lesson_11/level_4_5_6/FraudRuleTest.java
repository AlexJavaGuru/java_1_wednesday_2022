//package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class FraudRuleTest {
//
//    public static void main(String[] args) {
//
//        FraudRuleTest test = new FraudRuleTest();
//        test.pokemonTest1();
//        test.pokemonTest2();
//        test.amountTest1();
//        test.amountTest2();
//        test.cityTest1();
//        test.cityTest2();
//        test.countryTest1();
//        test.countryTest2();
//        test.germanyTest1();
//        test.germanyTest2();
//        test.isFraudTest1();
//        test.isFraudTest2();
//        test.isFraudTest3();
//        test.isFraudTest4();
//        test.isFraudTest5();
//        test.isFraudFalseTest();
//    }
//
//    void pokemonTest1() {
//        FraudRule1 fraud = new FraudRule1("Pokemon");
//        Trader trader = new Trader("Pokemon");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "Pokemon test1");
//    }
//
//    void pokemonTest2() {
//        FraudRule1 fraud = new FraudRule1("Pokemon");
//        Trader trader = new Trader("Alex");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "Pokemon test2");
//    }
//
//    void amountTest1() {
//        FraudRule2 fraud = new FraudRule2("Amount > 1000000");
//        Trader trader = new Trader("Alex");
//        Transaction t = new Transaction(trader, 5000000);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "Amount test1");
//    }
//
//    void amountTest2() {
//        FraudRule2 fraud = new FraudRule2("Amount > 1000000");
//        Trader trader = new Trader("Alex");
//        Transaction t = new Transaction(trader, 100);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "Amount test2");
//    }
//
//    void cityTest1() {
//        FraudRule3 fraud = new FraudRule3("City");
//        Trader trader = new Trader("Alex", "Sydney");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "City test1");
//    }
//
//    void cityTest2() {
//        FraudRule3 fraud = new FraudRule3("City");
//        Trader trader = new Trader("Alex", "Riga");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "City test2");
//    }
//
//    void countryTest1() {
//        FraudRule4 fraud = new FraudRule4("Country");
//        Trader trader = new Trader("Alex", "Test", "Jamaika");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "Country test1");
//    }
//
//    void countryTest2() {
//        FraudRule4 fraud = new FraudRule4("Country");
//        Trader trader = new Trader("Alex", "Riga", "Latvia");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "Country test2");
//    }
//
//    void germanyTest1() {
//        FraudRule5 fraud = new FraudRule5("Germany and >1000");
//        Trader trader = new Trader("Alex", "Berlin", "Germany");
//        Transaction t = new Transaction(trader, 5000);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "Germany and >1000 test1");
//    }
//
//    void germanyTest2() {
//        FraudRule5 fraud = new FraudRule5("Germany and >1000");
//        Trader trader = new Trader("Alex", "Berlin", "Germany");
//        Transaction t = new Transaction(trader, 100);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "Germany and >1000 test2");
//    }
//
//    void isFraudTest1() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "isFraud test1");
//    }
//
//    void isFraudTest2() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Alex", "Riga", "Latvia");
//        Transaction t = new Transaction(trader, 5000000);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "isFraud test2");
//    }
//
//    void isFraudTest3() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Alex", "Sydney", "Australia");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "isFraud test3");
//    }
//
//    void isFraudTest4() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Alex", "Test", "Jamaika");
//        Transaction t = new Transaction(trader);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "isFraud test4");
//    }
//
//    void isFraudTest5() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Alex", "Berlin", "Germany");
//        Transaction t = new Transaction(trader, 5000);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = true;
//        checkResult(expectedResult, actualResult, "isFraud test5");
//    }
//
//    void isFraudFalseTest() {
//        List<FraudRule> rules = new ArrayList<>();
//        FraudDetector fraud = new FraudDetector(rules);
//        Trader trader = new Trader("Alex", "Riga", "Latvia");
//        Transaction t = new Transaction(trader, 100);
//        boolean actualResult = fraud.isFraud(t);
//        boolean expectedResult = false;
//        checkResult(expectedResult, actualResult, "isFraud false test");
//    }
//
//    void checkResult(boolean expectedResult, boolean actualResult, String testName) {
//        if (expectedResult == actualResult) {
//            System.out.println(testName + " = OK");
//        } else {
//            System.out.println(testName + " = FAIL");
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
