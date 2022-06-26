package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

class FraudDetector {

    public static final int TRX_AMOUNT_LIMIT = 1000000;
    public static final int TRX_AMOUNT_LIMIT_GERMANY = 1000;

    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon") ||
                (t.getAmount() > TRX_AMOUNT_LIMIT) ||
                (t.getTrader().getCity().equals("Sidney")) ||
                (t.getTrader().getCountry().equals("Jamaica")) ||
                ((t.getTrader().getCountry().equals("Germany")) && (t.getAmount() > TRX_AMOUNT_LIMIT_GERMANY));
    }
}