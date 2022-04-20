package teacher.lesson_11_srp.lessoncode.newversion;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
