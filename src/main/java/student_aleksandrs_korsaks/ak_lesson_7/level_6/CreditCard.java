package student_aleksandrs_korsaks.ak_lesson_7.level_6;

class CreditCard {
    private long cardNumber;
    private int cardPinNumber;
    private int cardBalance;
    private int cardCreditLimit;
    private int cardOverdraft;

    CreditCard(long cardNumber, int cardPinNumber, int cardCreditLimit) {
        this.cardNumber = cardNumber;
        this.cardPinNumber = cardPinNumber;
        this.cardBalance = 0;
        this.cardCreditLimit = cardCreditLimit;
        this.cardOverdraft = 0;
    }

    private boolean isPinNumberValid(int cardPinNumber) {
        return (this.cardPinNumber == cardPinNumber);
    }

    private boolean isBalanceEnoughToWithdraw(int cashAmountForWithdraw) {
        return (cardBalance >= cashAmountForWithdraw);
    }

    private boolean isCreditLimitEnoughToWithdraw(int cashAmountForWithdraw, int cardOverdraft) {
        return (cardCreditLimit + cardBalance >= cashAmountForWithdraw - cardOverdraft);
    }

    void withdrawFromCard(int cashAmountForWithdraw, int cardPinNumber) {
        int overdraft;
        if (!isPinNumberValid(cardPinNumber)) {
            System.out.println("Wrong pin number");
        } else if (isBalanceEnoughToWithdraw(cashAmountForWithdraw)) {
            cardBalance -= cashAmountForWithdraw;
        } else if (isCreditLimitEnoughToWithdraw(cashAmountForWithdraw, cardOverdraft)) {
            overdraft = cardBalance - cashAmountForWithdraw;
            cardOverdraft += overdraft;
            cardBalance = 0;
        } else {
            System.out.println("not enough funds");
        }
    }

    void depositToCard(int cashAmountToDeposit, int cardPinNumber) {
        int deposit;
        if (!isPinNumberValid(cardPinNumber)) {
            System.out.println("Wrong pin number");
        } else if ((cardOverdraft < 0) && (cashAmountToDeposit >= -cardOverdraft)) {
            deposit = cardOverdraft + cashAmountToDeposit;
            cardOverdraft = 0;
            cardBalance += deposit;
        } else if ((cardOverdraft < 0) && (cashAmountToDeposit < -cardOverdraft)) {
            cardOverdraft += cashAmountToDeposit;
        } else {
            cardBalance += cashAmountToDeposit;
        }
    }

    long getCardNumber() {
        return cardNumber;
    }

    int getCardBalance() {
        return cardBalance;
    }

    int getCardCreditLimit() {
        return cardCreditLimit;
    }

    void setCardCreditLimit(int cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }

    int getCardOverdraft() {
        return cardOverdraft;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", cardBalance=" + cardBalance +
                ", cardCreditLimit=" + cardCreditLimit +
                ", cardOverdraft=" + cardOverdraft +
                '}';
    }
}
