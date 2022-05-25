package student_aleksandr_zuk.lesson_11;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Pokemon".equals(trader.getFullName())) {
            return true;
        }
        return false;
    }
}
