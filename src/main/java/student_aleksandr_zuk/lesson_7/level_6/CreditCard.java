package student_aleksandr_zuk.lesson_7.level_6;

class CreditCard {

    private long cardNumber;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.loanDebt = 0;
    }

    public void deposit(int pinCode, double amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin code is incorrect!");
        } else if (loanDebt > 0 && amount < loanDebt) {
            loanDebt -= amount;
        } else if (loanDebt > 0 && amount > loanDebt) {
            balance = balance + (amount - loanDebt);
            loanDebt = 0;
        } else if (loanDebt == 0) {
            balance += amount;
        }
    }

    public void withdraw(int pinCode, int amount) {
        if (this.pinCode != pinCode) {
            System.out.println("Pin code is incorrect!");
        } else if (amount > creditLimit + balance) {
            System.out.println("Credit limit exceeded!");
        } else if (amount <= balance) {
            balance -= amount;
        } else if (creditLimit > balance + amount) {
            amount -= balance;
            loanDebt += amount;
            balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }
}
