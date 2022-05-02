package student_arturs_melnikovs.lesson_11.level_04;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return isTraderFraud(t) || isAmountFraud(t) || isCityFraud(t) || isCountryFraud(t) || IsCountryAmountFraud(t);
    }

    boolean isTraderFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
    boolean isAmountFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
    boolean isCityFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }
    boolean isCountryFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry() == null) {
            return false;
        } else return transaction.getTrader().getCountry().equals("Jamaica");
    }
    boolean IsCountryAmountFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry() == null) {
            return false;
        } else return transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }

}
