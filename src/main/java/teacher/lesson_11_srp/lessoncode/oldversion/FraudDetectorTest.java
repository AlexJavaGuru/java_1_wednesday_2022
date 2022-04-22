package teacher.lesson_11_srp.lessoncode.oldversion;

public class FraudDetectorTest {
    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {
        isFraudTestPokemon();
        isFraudTestNotPokemon();
        isFraudTestCity();
        isFraudTestCountryAndAmount();
        isFraudTestAmount();
        printFooter();
    }

    private static void isFraudTestPokemon() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestPokemon");
    }

    private static void isFraudTestNotPokemon() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Pokemon111", "City1", "Country1"), 0);
        checkResult(!fraudDetector.isFraud(transaction),"isFraudTestNotPokemon");
    }

    private static void isFraudTestCity() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Country1"), 0);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestCity");
    }

    private static void isFraudTestCountryAndAmount() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader("Name1", "Sidney", "Germany"), 1000);
        checkResult(fraudDetector.isFraud(transaction),"isFraudTestCountryAndAmount");
    }

    private static void isFraudTestAmount() {
        totalRun++;
        Transaction transaction = new Transaction(new Trader ("Name2", "city", "Mambey"), 1000000);
        checkResult(fraudDetector.isFraud(transaction), "isFraudTestAmount");
    }


    private static void checkResult(boolean result, String testName) {
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


     private static void printFooter() {
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
