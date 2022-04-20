package teacher.lesson_11_srp.lessoncode.newversion;

import java.util.List;

public class FraudDetectionResult {

    private boolean fraud;
    private List<String> ruleNames;
    private Transaction transaction;

    public FraudDetectionResult(boolean fraud, List<String> ruleNames, Transaction transaction) {
        this.fraud = fraud;
        this.ruleNames = ruleNames;
        this.transaction = transaction;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public List<String> getRuleNames() {
        return ruleNames;
    }

    public void setRuleNames(List<String> ruleNames) {
        this.ruleNames = ruleNames;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
