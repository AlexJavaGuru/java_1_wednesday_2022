package student_jekaterina_soldatova.lesson11.level_5_middle;

import student_jekaterina_soldatova.lesson11.level_4_junior.Transaction;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
