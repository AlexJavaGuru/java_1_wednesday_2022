package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

import java.util.List;

class FraudDetector {

    List<FraudRule> rules;

    public FraudDetector(List<FraudRule> rules) {
        this.rules = rules;
    }

    boolean isFraud(Transaction t) {
//        return rules.stream().filter(FraudRule::isFraud).findFirst().orElse(false);
        for (FraudRule rule : rules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}

