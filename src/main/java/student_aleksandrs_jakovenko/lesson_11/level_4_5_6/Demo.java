package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

import java.util.ArrayList;
import java.util.List;

class Demo {

    public static void main(String[] args) {
        List<FraudRule> rules = new ArrayList<>();
        FraudRule5 rule5 = new FraudRule5("Rule5");
        rules.add(rule5);
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 5000);
        FraudDetectionResult actualResult = fraudDetector.isFraud(t, rules);
        System.out.println(actualResult);
    }
}
