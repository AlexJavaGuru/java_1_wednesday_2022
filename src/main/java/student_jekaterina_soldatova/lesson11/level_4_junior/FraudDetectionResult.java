package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult (boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
