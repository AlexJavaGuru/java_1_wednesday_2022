package studen_natalja_isajeva.lesson_3.level_4;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

   public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
