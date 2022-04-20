package teacher.lesson_11_srp.lessoncode.newversion;

public class FraudDetectorTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private FraudRule[] fraudRules = {
            new FraudRule1("Rule1"),
            new FraudRule2("Rule2"),
            new FraudRule3("Rule3"),
            new FraudRule4("Rule4"),
            new FraudRule5("Rule5"),
    };

    private FraudDetector fraudDetector = new FraudDetector(fraudRules);

    public static void main(String[] args) {
        FraudDetectorTest testRunner = new FraudDetectorTest();
        testRunner.isFraudTestPokemon();
        testRunner.isFraudTestNotPokemon();
        testRunner.isFraudTestCity();
        testRunner.isFraudTestCountryAndAmount();
        testRunner.isFraudTestAmount();
        testRunner.printFooter();
    }

    private void isFraudTestPokemon() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestPokemon");
    }

    private void isFraudTestNotPokemon() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon111", "City1", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(!result.isFraud(),"isFraudTestNotPokemon");
    }

    private void isFraudTestCity() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Country1"), 0);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestCity");
    }

    private void isFraudTestCountryAndAmount() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Germany"), 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(),"isFraudTestCountryAndAmount");
    }

    private void isFraudTestAmount() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name2", "city", "Mambey"), 1000000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        checkResult(result.isFraud(), "isFraudTestAmount");
    }


    private void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(TEXT_GREEN + testName + " - passed" + TEXT_RESET);
            totalPassed++;
        } else {
            System.out.println(TEXT_RED + testName + " - failed");
            System.out.println("Expected: " + !result);
            System.out.println("Actual:   " + result + TEXT_RESET);
            totalFailed++;
        }
    }


     private void printFooter() {
        System.out.println("********************************************");
        if (totalFailed > 0) {
            System.out.println(TEXT_RED + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        } else {
            System.out.println(TEXT_GREEN + "TOTAL: RUN = " + totalRun + "; PASSED = " + totalPassed +
                    "; FAILED = " + totalFailed + TEXT_RESET);
        }
        System.out.println("********************************************");
    }
}
