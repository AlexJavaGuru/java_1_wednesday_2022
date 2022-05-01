package student_jekaterina_soldatova.lesson11.level_4_junior;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return (traderNameCheck(t) || amountTooBigCheck(t) || traderCityCheck(t));
    }

    boolean traderNameCheck(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    boolean amountTooBigCheck(Transaction t) {
        return t.getAmount()>1000000;
    }

    boolean traderCityCheck(Transaction t) {
        return (t.getTrader().getCity().equals("Sydney") || t.getTrader().getCity().equals("Jamaica"));
    }
}
