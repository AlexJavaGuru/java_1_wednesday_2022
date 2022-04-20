package student_arturs_melnikovs.lesson_11.level_05;

class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
