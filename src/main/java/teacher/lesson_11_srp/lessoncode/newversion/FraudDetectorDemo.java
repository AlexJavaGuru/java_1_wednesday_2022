package teacher.lesson_11_srp.lessoncode.newversion;

import java.util.Collections;

public class FraudDetectorDemo {

    public static void main(String[] args) {
        FraudRule[] fraudRules = {
                new FraudRule1("Rule1"),
                new FraudRule2("Rule2"),
                new FraudRule3("Rule3"),
                new FraudRule4("Rule4"),
                new FraudRule5("Rule5"),
        };
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pokemon", "City1", "Country1"), 1000001);

        FraudDetectionResult result = fraudDetector.isFraud(transaction);

        for (String ruleName : result.getRuleNames()) {
            System.out.println(ruleName);
        }

        System.out.println(result.getTransaction());
    }
}
