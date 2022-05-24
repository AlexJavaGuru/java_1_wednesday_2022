package student_aleksandr_zuk.lesson_11;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Sydney".equals(trader.getCity())) {
            return true;
        }
        return false;
    }
}
