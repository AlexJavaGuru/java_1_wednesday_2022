package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Sydney".equals(trader.getCity())) {
            return true;
        }
        return false;
    }
}