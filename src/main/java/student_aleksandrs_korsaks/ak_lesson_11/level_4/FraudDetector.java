package student_aleksandrs_korsaks.ak_lesson_11.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}