package teacher.lesson_11_srp.lessoncode.newversion;

public class FraudRule1Test {

    private static final String TEXT_RESET = "\u001B[0m";
    private static final String TEXT_RED = "\u001B[31m";
    private static final String TEXT_GREEN = "\u001B[32m";

    private static int totalRun = 0;
    private static int totalPassed = 0;
    private static int totalFailed = 0;

    static FraudRule1 victim = new FraudRule1("Rule1");

    public static void main(String[] args) {
        testThatRuleIsWorking();
    }

    public static void testThatRuleIsWorking() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 0);
        checkResult(victim.isFraud(transaction), "test1");
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
}
