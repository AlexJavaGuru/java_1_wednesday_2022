package teacher.lesson_11_srp.lessoncode.newversion;

public class FraudRule2 extends FraudRule {
    FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 100000;
    }
}
