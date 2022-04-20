package student_arturs_melnikovs.lesson_11.level_05;

class FraudRule3 extends FraudRule {

    FraudRule3(String ruleName) {
        super(ruleName);
    }
    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }
}
