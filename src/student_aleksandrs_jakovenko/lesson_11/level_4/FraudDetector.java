package student_aleksandrs_jakovenko.lesson_11.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if ("Pokemon".equals(trader.getFullName())){
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if ("Sydney".equals(trader.getCity())) {
            return true;
        } else if ("Jamaika".equals(trader.getCountry())) {
            return true;
        } else if ("Germany".equals(trader.getCountry()) && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}