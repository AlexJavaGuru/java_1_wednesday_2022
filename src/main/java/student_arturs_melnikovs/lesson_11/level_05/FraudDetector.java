package student_arturs_melnikovs.lesson_11.level_05;

import java.util.List;

class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                System.out.println(t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
