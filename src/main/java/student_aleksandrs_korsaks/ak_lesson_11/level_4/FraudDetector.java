package student_aleksandrs_korsaks.ak_lesson_11.level_4;

class FraudDetector {

    public static final int TRX_AMOUNT_LIMIT = 1000000;

    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon") ||
                (t.getAmount() > TRX_AMOUNT_LIMIT);
    }

}