package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Germany".equals(trader.getCountry()) && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}