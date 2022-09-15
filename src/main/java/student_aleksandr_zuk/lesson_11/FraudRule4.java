package student_aleksandr_zuk.lesson_11;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Jamaica".equals(trader.getCountry())){
            return true;
        }
        return false;
    }
}
