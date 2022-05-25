package student_aleksandr_zuk.lesson_11;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Germany".equals(trader.getCountry()) && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}
