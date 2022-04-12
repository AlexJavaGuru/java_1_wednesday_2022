package student_andrejs_saldavs.lesson_07.level_6;

class CreditCard {

    private long cardNumber;
    private int securityPin;
    private int balance;
    int creditLimit;
    private int debt;

    public CreditCard(long cardNumber, int securityPin) {
        this.cardNumber = cardNumber;
        this.securityPin = securityPin;
        balance = 0;
        debt = 0;
    }


    public void deposit(int securityPin, int depositAmount) {
        if (this.securityPin != securityPin) {
            System.out.println("Cancelled, wrong PIN");
        } else if (debt > 0 && depositAmount >= debt) {
            balance += depositAmount - debt;
            debt = 0;
        } else if (debt > 0) {
            debt -= depositAmount;
        } else if (debt == 0) {
            balance += depositAmount;
        }
    }

    public void withdraw(int securityPin, int withdrawAmount) {
        if (this.securityPin != securityPin) {
            System.out.println("Cancelled, wrong PIN");
        } else if (balance >= withdrawAmount) {
            balance += withdrawAmount;
        } else if (balance + creditLimit >= withdrawAmount) {
            withdrawAmount -= balance;
            balance = 0;
            creditLimit += withdrawAmount;
        } else if (balance + creditLimit < withdrawAmount) {
            System.out.println("Not enough money... Credit limit exceeded.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getDebt() {
        return debt;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }




}
