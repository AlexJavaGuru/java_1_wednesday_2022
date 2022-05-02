package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Pokemon".equals(trader.getFullName())) {
            return true;
        }
        return false;
    }
}