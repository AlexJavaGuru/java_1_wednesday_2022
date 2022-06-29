package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

import java.util.Objects;
import java.util.Optional;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getIsFraud() {
        return fraud;
    }

    public String getRuleNameResult() {
        return Optional.ofNullable(ruleName).orElse("");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FraudDetectionResult that)) return false;
        return fraud == that.fraud && getRuleNameResult().equals(that.getRuleNameResult());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraud, getRuleNameResult());
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "fraud = " + fraud +
                ", ruleName = " + ruleName +
                '}';
    }
}
