package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return (t.getTrader().getFullName().equals("Pokemon") || t.getAmount()>1000000);
    }
}
