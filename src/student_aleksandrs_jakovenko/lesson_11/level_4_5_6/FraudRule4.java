package student_aleksandrs_jakovenko.lesson_11.level_4_5_6;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Jamaika".equals(trader.getCountry())) {
            return true;
        }
        return false;
    }
}