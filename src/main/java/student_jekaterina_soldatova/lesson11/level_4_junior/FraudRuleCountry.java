package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudRuleCountry extends FraudRule {

    public FraudRuleCountry(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry() == null) {
            return false;
        } else {
            return t.getTrader().getCountry().equals("Jamaica");
        }
    }
}
