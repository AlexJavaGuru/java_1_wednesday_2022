package teacher.lesson_11_srp.lessoncode.newversion;

public class FraudRule1 extends FraudRule {

    FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
