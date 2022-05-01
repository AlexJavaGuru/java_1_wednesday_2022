package student_jekaterina_soldatova.lesson11.level_5_middle;

class FraudRuleName extends FraudRule {

    public FraudRuleName(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");;
    }

}
