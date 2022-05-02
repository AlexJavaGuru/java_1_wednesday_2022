package student_arturs_melnikovs.lesson_11.level_05;

class FraudRule5 extends FraudRule {

    FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
