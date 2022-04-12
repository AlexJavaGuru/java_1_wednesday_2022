package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

import java.util.List;

class FraudDetector {

    public FraudDetector() {
    }

    boolean isFraud(Transaction t, List<FraudRule> rules) {
        for (FraudRule rule : rules) {
            rule.isFraud(t);
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}