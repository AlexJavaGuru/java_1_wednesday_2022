package teacher.lesson_3_oop_first_look.lessoncode;

public class BankCard {

    String bankName;
    String paymentsProcessor;
    String name;
    long cardNumber;
    String expirationDate;
    int securityCode;
    int balance;

    public BankCard() {
    }

    public BankCard(String bankName, long cardNumber, int securityCode, int balance) {
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void depositFund() {

    }

    public void withdrawFunds() {

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
