package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudRuleCity extends FraudRule {

    public FraudRuleCity(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t)  {
        return (t.getTrader().getCity().equals("Sydney"));
    }
}
