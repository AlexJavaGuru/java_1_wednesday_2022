package student_aleksandrs_jakovenko.lesson_11.level_4_5;

import java.util.List;

class FraudDetector {

    private List<FraudRule> rules;

    public FraudDetector(List<FraudRule> rules) {
        FraudRule1 rule1 = new FraudRule1("Rule1");
        FraudRule2 rule2 = new FraudRule2("Rule2");
        FraudRule3 rule3 = new FraudRule3("Rule3");
        FraudRule4 rule4 = new FraudRule4("Rule4");
        FraudRule5 rule5 = new FraudRule5("Rule5");
        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
        rules.add(rule4);
        rules.add(rule5);
        this.rules = rules;
    }

    public FraudDetector() {
    }

    boolean isFraud(Transaction t) {
        for (FraudRule rule : rules) {
            rule.isFraud(t);
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}