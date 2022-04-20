package student_arturs_melnikovs.lesson_11.level_05;

class FraudRule4 extends FraudRule {

    FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
