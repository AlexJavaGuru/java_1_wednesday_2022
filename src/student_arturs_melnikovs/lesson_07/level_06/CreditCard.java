package student_arturs_melnikovs.lesson_07.level_06;

class CreditCard {
    private long cardNumber;
    private int pinCode;
    private int balance;
    int creditLimit;
    private int creditDebt;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        creditDebt = 0;
        balance = 0;
    }

    public void deposit(int pinCode, int amountToDeposit) {
        if (this.pinCode != pinCode) {
            System.out.println("Wrong PIN");
        } else if (creditDebt > 0 && amountToDeposit >= creditDebt) {
            balance += amountToDeposit - creditDebt;
            creditDebt = 0;
        } else if (creditDebt > 0) {
            creditDebt -= amountToDeposit;
        } else if (creditDebt == 0) {
            balance += amountToDeposit;
        }
    }

    public void withdraw(int pinCode, int amountToWithdraw) {
        if (this.pinCode != pinCode) {
            System.out.println("Wrong PIN");
        } else if (amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        } else if (amountToWithdraw <= balance + creditLimit) {
            amountToWithdraw -= balance;
            balance = 0;
            creditDebt += amountToWithdraw;
        } else if (amountToWithdraw > balance + creditLimit) {
            System.out.println("Not enough money. Credit limit exceeded.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
