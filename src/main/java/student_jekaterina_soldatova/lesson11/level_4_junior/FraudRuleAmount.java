package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudRuleAmount extends FraudRule {

    public FraudRuleAmount(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount()>1000000;
    }
}
