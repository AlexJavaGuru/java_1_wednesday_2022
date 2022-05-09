package student_jekaterina_soldatova.lesson11.level_4_junior;

import java.util.List;

class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }

}
